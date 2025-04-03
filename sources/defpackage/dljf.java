package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dljf implements dlib {
    private static final efil a = new efil(dlid.a);
    private final Context b;
    private final dlpw c;
    private final efgc d;
    private final Map e;

    public dljf(Context context, dlpw dlpwVar, efgc efgcVar) {
        context.getClass();
        dlpwVar.getClass();
        efgcVar.getClass();
        this.b = context;
        this.c = dlpwVar;
        this.d = efgcVar;
        this.e = new LinkedHashMap();
    }

    @Override // defpackage.dlib
    public final synchronized dlia a(dlgb dlgbVar) {
        dlgbVar.getClass();
        dlia dliaVar = (dlia) this.e.get(dlgbVar);
        if (dliaVar != null) {
            return dliaVar;
        }
        Context context = this.b;
        Pattern pattern = efbs.a;
        efbr efbrVar = new efbr(context);
        efbrVar.f("moirai");
        efbrVar.g(ffkj.e(dlgbVar.b, "") ? "metadata.pb" : a.i(dlgbVar, "metadata_{", ".role}.pb"));
        efbrVar.b.h(efep.b(efep.a));
        Uri a2 = efbrVar.a();
        a2.getClass();
        effz h = efga.h();
        h.f(a2);
        h.e(dlid.a);
        h.d(a);
        dlje dljeVar = new dlje(this.c, this.d.a(h.a()));
        this.e.put(dlgbVar, dljeVar);
        return dljeVar;
    }
}
