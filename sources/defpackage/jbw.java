package defpackage;

import android.view.ActionMode;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbw {
    public ActionMode a;
    private final View c;
    private final jhr d = new jhr(new jbv(this), 126);
    public int b = 2;

    public jbw(View view) {
        this.c = view;
    }

    public final void a() {
        this.b = 2;
        ActionMode actionMode = this.a;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.a = null;
    }

    public final void b(iam iamVar, ffix ffixVar, ffix ffixVar2, ffix ffixVar3, ffix ffixVar4, ffix ffixVar5) {
        jhr jhrVar = this.d;
        jhrVar.b = iamVar;
        jhrVar.c = ffixVar;
        jhrVar.e = ffixVar3;
        jhrVar.d = ffixVar2;
        jhrVar.f = ffixVar4;
        jhrVar.g = ffixVar5;
        ActionMode actionMode = this.a;
        if (actionMode != null) {
            actionMode.invalidate();
        } else {
            this.b = 1;
            this.a = this.c.startActionMode(new jhp(jhrVar), 1);
        }
    }
}
