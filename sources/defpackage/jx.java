package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jx {
    final int a;
    int b;
    int c;
    int d;
    ViewGroup e;
    View f;
    View g;
    public od h;
    nz i;
    Context j;
    boolean k;
    boolean l;
    boolean m;
    boolean n = false;
    boolean o;
    Bundle p;

    public jx(int i) {
        this.a = i;
    }

    final void a(od odVar) {
        nz nzVar;
        od odVar2 = this.h;
        if (odVar == odVar2) {
            return;
        }
        if (odVar2 != null) {
            odVar2.m(this.i);
        }
        this.h = odVar;
        if (odVar == null || (nzVar = this.i) == null) {
            return;
        }
        odVar.g(nzVar);
    }
}
