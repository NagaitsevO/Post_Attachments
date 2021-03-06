data class Comments (
        var count: Int = 0,
        var canPost: Boolean = false,
        var groupsCanPost: Boolean = false,
        var canClose: Boolean = false,
        var canOpen: Boolean = false

)

{}

/*comments object	информация о комментариях к записи, объект с полями:
    count (integer) — количество комментариев;
    can_post* (integer, [0,1]) — информация о том, может ли текущий пользователь комментировать запись (1 — может, 0 — не может);
    groups_can_post (integer, [0,1]) — информация о том, могут ли сообщества комментировать запись;
    can_close(boolean) — может ли текущий пользователь закрыть комментарии к записи;
    can_open(boolean) — может ли текущий пользователь открыть комментарии к записи.

 */