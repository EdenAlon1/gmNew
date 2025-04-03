package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebmh {
    public final ebbb a;
    public final Context b;
    public final lkr c;
    public engw d;
    public engw e;
    public boolean f;
    private boolean g;
    private boolean h;

    public ebmh(ebbb ebbbVar, Context context, lkr lkrVar) {
        int i = engw.d;
        engw engwVar = enou.a;
        this.d = engwVar;
        this.e = engwVar;
        this.a = ebbbVar;
        this.b = context;
        this.c = lkrVar;
    }

    private final void d() {
        ebga ebgaVar = ((ebbg) this.a).e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final ebmg a() {
        engw engwVar;
        final llf llfVar;
        ebgs ebgsVar = ((ebgd) ((ebbg) this.a).e).g;
        if (this.g) {
            engwVar = ebgsVar.d();
        } else {
            int i = engw.d;
            engwVar = enou.a;
        }
        int i2 = engw.d;
        engw engwVar2 = enou.a;
        engwVar2.getClass();
        engr engrVar = new engr();
        engr engrVar2 = new engr();
        engrVar.j(this.e);
        if (this.h) {
            if (engwVar.isEmpty()) {
                d();
            } else {
                d();
            }
        }
        emxc emxcVar = ((ebgd) ((ebbg) this.a).e).i;
        if (this.f && emxcVar.g()) {
            Object c = emxcVar.c();
            Context context = this.b;
            final lkr lkrVar = this.c;
            ebga ebgaVar = ((ebbg) this.a).e;
            final emux emuxVar = emux.a;
            emyl emylVar = new emyl() { // from class: ebmf
                @Override // defpackage.emyl
                public final Object get() {
                    ebmh ebmhVar = ebmh.this;
                    return new ebgm(((ebbg) ebmhVar.a).e, ((ebbg) ebmhVar.a).b);
                }
            };
            String string = context.getString(R.string.og_recommended_actions_entry_point);
            if (string == null) {
                throw new NullPointerException("Null recommendedActions");
            }
            ebfe f = ebff.f(ku.a(context, true != ((ebns) eboq.e(context)).a ? R.drawable.yellow_alert_dark_vd : R.drawable.yellow_alert_vd));
            ((ebcv) f).b = emxc.j(context.getString(R.string.og_important_account_alert_badge_a11y_label));
            ebff d = f.d();
            ebff g = ebff.g(ku.a(context, R.drawable.safer_gshield_ic_outline_hero));
            String packageName = context.getPackageName();
            if (packageName == null) {
                throw new NullPointerException("Null appPackageName");
            }
            final ebhq ebhqVar = new ebhq(string, d, g, packageName);
            final ebhn ebhnVar = (ebhn) c;
            ((lld) emylVar.get()).f(lkrVar, new llh() { // from class: ebhj
                @Override // defpackage.llh
                public final void a(Object obj) {
                    Boolean bool = (Boolean) obj;
                    boolean booleanValue = bool.booleanValue();
                    ebhn ebhnVar2 = ebhn.this;
                    ebhnVar2.m = booleanValue;
                    ebhnVar2.a(ebhnVar2.i, ebhnVar2.l, ebhnVar2.h, bool.booleanValue());
                }
            });
            lkrVar.P().c(ebhnVar.g);
            engrVar.h(new ebcn(new ebcx() { // from class: ebhk
                @Override // defpackage.ebcx
                public final ebdf a(Object obj) {
                    ebhn ebhnVar2 = ebhn.this;
                    ebhnVar2.i = obj;
                    Object obj2 = ebhnVar2.i;
                    if (obj2 != null) {
                        emxc emxcVar2 = emuxVar;
                        ebhnVar2.h = new ebhb(ebhqVar, lkrVar, ebhnVar2.c, ebhnVar2.d, ebkp.b(ebhnVar2.a, obj2), emxcVar2);
                        ebhnVar2.a(ebhnVar2.i, ebhnVar2.l, ebhnVar2.h, ebhnVar2.m);
                    } else {
                        ebhnVar2.h = null;
                    }
                    return ebhnVar2.h;
                }
            }));
        }
        engw g2 = engrVar.g();
        engrVar2.j(this.d);
        engw g3 = engrVar2.g();
        if (engwVar.isEmpty() && engwVar2.isEmpty() && g2.isEmpty()) {
            llfVar = null;
        } else {
            final ebdx ebdxVar = new ebdx();
            ebdxVar.a = g2;
            engw engwVar3 = enou.a;
            engr engrVar3 = new engr();
            engrVar3.j(engwVar3);
            engrVar3.j(engwVar2);
            int i3 = ((enou) engwVar).c;
            for (int i4 = 0; i4 < i3; i4++) {
                final ebgo ebgoVar = (ebgo) engwVar.get(i4);
                engrVar3.h(new ebcn(new ebcx() { // from class: ebme
                    @Override // defpackage.ebcx
                    public final ebdf a(Object obj) {
                        ebgo ebgoVar2 = ebgo.this;
                        ebfn h = ebfp.h();
                        h.f(ebgoVar2.b());
                        ebfr ebfrVar = (ebfr) h;
                        ebfrVar.a = ebgoVar2.d();
                        h.e(ebgoVar2.a());
                        h.g(ebgoVar2.i());
                        h.h(ebgoVar2.c());
                        ebfrVar.b = ebgoVar2.e();
                        ebfrVar.c = ebgoVar2.g();
                        ebfrVar.d = ebgoVar2.f();
                        h.d(ebgoVar2.h());
                        return new ebcm(h.b());
                    }
                }));
            }
            ebdxVar.b = engrVar3.g();
            llfVar = new llf();
            llfVar.p(new llg(enou.a), new llh() { // from class: ebdw
                @Override // defpackage.llh
                public final void a(Object obj) {
                    int i5 = engw.d;
                    engr engrVar4 = new engr();
                    ebdx ebdxVar2 = ebdx.this;
                    engrVar4.j(ebdxVar2.a);
                    engrVar4.j((engw) obj);
                    engrVar4.j(ebdxVar2.b);
                    llfVar.m(engrVar4.g());
                }
            });
        }
        return new ebmd(llfVar, g3.isEmpty() ? null : new llg(g3));
    }

    final void b() {
        this.g = true;
    }

    final void c() {
        this.h = true;
    }
}
