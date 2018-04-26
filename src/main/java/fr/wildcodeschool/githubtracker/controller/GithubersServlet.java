package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/githubers")
public class GithubersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Githuber> giters = new ArrayList<Githuber>();
        Githuber git = new Githuber("darracq", "dardar@yahoo.fr", "step", 1, "http://essai.fr");
        Githuber git1 = new Githuber("Sahli", "sahli@yahoo.fr", "sahli", 2, "http://essai1.fr");
        Githuber git2 = new Githuber("Brureau", "brureau@yahoo.fr", "Ged", 3, "http://essai2.fr");
        Githuber git3 = new Githuber("Bentejac", "ben@yahoo.fr", "ben", 4, "http://essai3.fr");
        Githuber git4 = new Githuber("Bourbonnais", "bourbon@yahoo.fr", "bou", 5, "http://essai4.fr");

        giters.add(git);
        giters.add(git1);
        giters.add(git2);
        giters.add(git3);
        giters.add(git4);
        req.setAttribute("listGithuber",giters);
        req.getRequestDispatcher("githubers.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
