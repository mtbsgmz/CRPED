package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-07-19T14:02:34.753+0300")
@StaticMetamodel(Project.class)
public class Project_ {
	public static volatile SingularAttribute<Project, Long> id;
	public static volatile SingularAttribute<Project, String> name;
	public static volatile SingularAttribute<Project, Double> cost;
	public static volatile SingularAttribute<Project, String> manager;
	public static volatile SingularAttribute<Project, Status> STATUS;
	public static volatile SingularAttribute<Project, String> location;
	public static volatile SingularAttribute<Project, Date> baslangic;
	public static volatile SingularAttribute<Project, Date> bitis;
	public static volatile SingularAttribute<Project, Long> account_id;
	public static volatile SingularAttribute<Project, Long> report_id;
	public static volatile SingularAttribute<Project, String> description;
}
