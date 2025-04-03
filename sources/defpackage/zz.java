package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class zz implements Runnable {
    final /* synthetic */ aaf a;
    final /* synthetic */ int b;
    final /* synthetic */ aai c;

    public zz(aai aaiVar, aaf aafVar, int i) {
        this.c = aaiVar;
        this.a = aafVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.c.m;
        if (recyclerView == null || !recyclerView.r) {
            return;
        }
        aaf aafVar = this.a;
        if (aafVar.n || aafVar.h.fq() == -1) {
            return;
        }
        vr vrVar = this.c.m.E;
        if (vrVar == null || !vrVar.i()) {
            aai aaiVar = this.c;
            int size = aaiVar.l.size();
            for (int i = 0; i < size; i++) {
                if (((aaf) aaiVar.l.get(i)).o) {
                }
            }
            aai aaiVar2 = this.c;
            aaf aafVar2 = this.a;
            aaiVar2.j.i(aafVar2.h, this.b);
            return;
        }
        this.c.m.post(this);
    }
}
