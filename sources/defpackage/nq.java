package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class nq implements oq {
    protected final Context a;
    public Context b;
    public od c;
    public final LayoutInflater d;
    public op e;
    public os f;
    public int g;

    public nq(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    @Override // defpackage.oq
    public final int a() {
        return this.g;
    }

    public View b(og ogVar, View view, ViewGroup viewGroup) {
        throw null;
    }

    @Override // defpackage.oq
    public void c(Context context, od odVar) {
        throw null;
    }

    @Override // defpackage.oq
    public void d(od odVar, boolean z) {
        throw null;
    }

    @Override // defpackage.oq
    public final void e(op opVar) {
        throw null;
    }

    @Override // defpackage.oq
    public void f(boolean z) {
        throw null;
    }

    @Override // defpackage.oq
    public boolean g() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [od] */
    @Override // defpackage.oq
    public boolean h(oy oyVar) {
        op opVar = this.e;
        oy oyVar2 = oyVar;
        if (opVar == null) {
            return false;
        }
        if (oyVar == null) {
            oyVar2 = this.c;
        }
        return opVar.b(oyVar2);
    }

    @Override // defpackage.oq
    public final boolean i(og ogVar) {
        return false;
    }

    @Override // defpackage.oq
    public final boolean j(og ogVar) {
        return false;
    }
}
