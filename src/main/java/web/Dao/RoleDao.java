package web.Dao;

import web.models.Role;
import java.util.Set;

public interface RoleDao  {

    public Role getOne(Long aLong);

    void add(Role role);
    void deleteRole(Role role);
    public void deleteRoles(Set<Role> roles);
    void update(Role role);
    Role getById(int id);
    Role getByName(String name);
}
