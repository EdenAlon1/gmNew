package defpackage;

import com.google.android.gms.common.api.Scope;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhpd {
    public static final dfqs a;
    public static final dfqs b;
    public static final dfqj c;
    static final dfqj d;
    public static final dfqt e;

    static {
        dfqs dfqsVar = new dfqs();
        a = dfqsVar;
        dfqs dfqsVar2 = new dfqs();
        b = dfqsVar2;
        dhpa dhpaVar = new dhpa();
        c = dhpaVar;
        dhpb dhpbVar = new dhpb();
        d = dhpbVar;
        new Scope("profile");
        new Scope("email");
        e = new dfqt("SignIn.API", dhpaVar, dfqsVar);
        new dfqt("SignIn.INTERNAL_API", dhpbVar, dfqsVar2);
    }
}
