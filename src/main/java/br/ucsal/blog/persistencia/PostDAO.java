package br.ucsal.blog.persistencia;

import java.util.List;
import java.util.ArrayList;

import br.ucsal.blog.model.Post;

public class PostDAO {
	
	private static List<Post> posts = new ArrayList<Post>();
	
	static {
		
		posts.add(new Post("Post 1", "Texto Texto 1", "Autor 1"));
		posts.add(new Post("Post 2", "Texto Texto  2", "Autor 2"));
		posts.add(new Post("Post 3", "Texto Texto  3", "Autor 3"));
		posts.add(new Post("Post 4", "Texto Texto  4", "Autor 4"));
	}
	
	public List<Post> listar(){
		return posts;
	}
}
