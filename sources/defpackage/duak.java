package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class duak {
    protected Map b;
    protected final String c;
    public final dual e;
    public final ContentValues a = new ContentValues();
    protected final engr d = new engr();

    protected duak(String str) {
        this.c = str;
        dtrl dtrlVar = new dtrl();
        dtrlVar.e(false);
        dtrlVar.f(dtub.c.r());
        dtrlVar.d(false);
        dtrlVar.b = "main";
        dtrlVar.c(0);
        dtrlVar.b = "$primary";
        dtrlVar.a = dtui.a;
        this.e = dtrlVar;
    }

    private final dtve a() {
        return dtub.e(((dtrm) this.e.g()).e);
    }

    public final int ae(duap duapVar, String str) {
        if (!this.d.g().isEmpty()) {
            throw new IllegalStateException("don't combine updateFor and custom where");
        }
        this.d.h(duapVar);
        ap(str);
        return b().g(a(), 0, dtzu.b());
    }

    public final void af(duap duapVar) {
        this.d.h(duapVar);
    }

    public final void ag(String str, dtzj dtzjVar) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        this.b.put(str, dtzjVar);
    }

    protected final void ah() {
        duam duamVar = ((dtrm) this.e.g()).h;
        if (duamVar != null) {
            dtrn dtrnVar = (dtrn) duamVar;
            emxf.l(!dtrnVar.b.isEmpty());
            emxf.l(true);
            emxf.l(dtrnVar.a.getColumnCount() + (-1) == dtrnVar.b.size());
        }
    }

    public final void ai(dtry dtryVar) {
        this.a.remove(dtryVar.d());
    }

    public final boolean aj(duap duapVar, String str) {
        if (!this.d.g().isEmpty()) {
            throw new IllegalStateException("don't combine updateFor and custom where");
        }
        this.d.h(duapVar);
        ap(str);
        return b().g(a(), 0, dtzu.b()) != 0;
    }

    public final void ak() {
        this.e.e(true);
    }

    public final void al() {
        this.e.f(false);
    }

    public final void am() {
        this.e.f(true);
    }

    public final void an(dtui dtuiVar) {
        ((dtrl) this.e).a = dtuiVar;
    }

    public final void ao(engw engwVar, Cursor cursor, dtzj dtzjVar) {
        ((dtrl) this.e).c = new dtrn(cursor, engwVar, dtzjVar);
    }

    public final void ap(String str) {
        an(new dtui(str));
    }

    public abstract duaj b();

    public final boolean equals(Object obj) {
        return (obj instanceof duak) && this.a.equals(((duak) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
