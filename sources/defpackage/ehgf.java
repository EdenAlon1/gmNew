package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ehgf implements ehhj {
    public final ExtendedFloatingActionButton a;
    public egza b;
    private final Context c;
    private final ArrayList d = new ArrayList();
    private final ehgd e;
    private egza f;

    public ehgf(ExtendedFloatingActionButton extendedFloatingActionButton, ehgd ehgdVar) {
        this.a = extendedFloatingActionButton;
        this.c = extendedFloatingActionButton.getContext();
        this.e = ehgdVar;
    }

    @Override // defpackage.ehhj
    public AnimatorSet a() {
        return b(c());
    }

    final AnimatorSet b(egza egzaVar) {
        ArrayList arrayList = new ArrayList();
        if (egzaVar.f("opacity")) {
            arrayList.add(egzaVar.a("opacity", this.a, View.ALPHA));
        }
        if (egzaVar.f("scale")) {
            arrayList.add(egzaVar.a("scale", this.a, View.SCALE_Y));
            arrayList.add(egzaVar.a("scale", this.a, View.SCALE_X));
        }
        if (egzaVar.f("width")) {
            arrayList.add(egzaVar.a("width", this.a, ExtendedFloatingActionButton.k));
        }
        if (egzaVar.f("height")) {
            arrayList.add(egzaVar.a("height", this.a, ExtendedFloatingActionButton.l));
        }
        if (egzaVar.f("paddingStart")) {
            arrayList.add(egzaVar.a("paddingStart", this.a, ExtendedFloatingActionButton.m));
        }
        if (egzaVar.f("paddingEnd")) {
            arrayList.add(egzaVar.a("paddingEnd", this.a, ExtendedFloatingActionButton.n));
        }
        if (egzaVar.f("labelOpacity")) {
            arrayList.add(egzaVar.a("labelOpacity", this.a, new ehge(this, Float.class)));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        egyw.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final egza c() {
        egza egzaVar = this.b;
        if (egzaVar != null) {
            return egzaVar;
        }
        if (this.f == null) {
            this.f = egza.c(this.c, h());
        }
        egza egzaVar2 = this.f;
        ksw.h(egzaVar2);
        return egzaVar2;
    }

    @Override // defpackage.ehhj
    public final List d() {
        return this.d;
    }

    @Override // defpackage.ehhj
    public void e() {
        this.e.a();
    }

    @Override // defpackage.ehhj
    public void f() {
        this.e.a();
    }

    @Override // defpackage.ehhj
    public void g(Animator animator) {
        ehgd ehgdVar = this.e;
        Animator animator2 = ehgdVar.a;
        if (animator2 != null) {
            animator2.cancel();
        }
        ehgdVar.a = animator;
    }
}
