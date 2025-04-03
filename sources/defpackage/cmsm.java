package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmsm {
    public static final ensn a;
    public static final ensn b;
    public static final ensn c;
    public static final ensn d;
    public static final ensn e;
    public static final ensn f;
    public static final ensn g;
    public static final ensn h;
    public static final ensn i;
    public static final ensn j;
    public static final ensn k;
    public static final ensn l;
    public static final ensn m;
    public static final ensn n;
    public static final ensn o;
    public static final ensn p;
    public static final ensn q;
    public static final ensn r;
    public static final ensn s;
    public static final ensn t;

    static {
        new ensn("reaction_message_id", String.class, false, false);
        a = new ensn("reaction_message_id", MessageIdType.class, false, false);
        b = new ensn("reaction_rcs_message_id", String.class, false, false);
        c = new ensn("reaction_rcs_message_id", bdhg.class, false, false);
        d = new ensn("reacted_message_id", String.class, false, false);
        e = new ensn("reacted_message_id", MessageIdType.class, false, false);
        f = new ensn("reacted_rcs_message_id", String.class, false, false);
        g = new ensn("reacted_rcs_message_id", bdhg.class, false, false);
        h = new ensn("reaction_surface_type", eprt.class, false, false);
        i = new ensn("reaction_action", cmrm.class, false, false);
        j = new ensn("is_reaction_unspecified", Boolean.class, false, false);
        k = new ensn("message_status", String.class, false, false);
        l = new ensn("message_is_rcs", Boolean.class, false, false);
        m = new ensn("message_can_reply", Boolean.class, false, false);
        n = new ensn("rcs_sending_available", Boolean.class, false, false);
        o = new ensn("has_text", Boolean.class, false, false);
        p = new ensn("transport_selection_status", cnea.class, false, false);
        q = new ensn("reactions_transport_type", cndn.class, false, false);
        r = new ensn("match_count", Integer.class, false, false);
        s = new ensn("content_uri", String.class, false, false);
        t = new ensn("emotify_id", String.class, false, false);
    }
}
