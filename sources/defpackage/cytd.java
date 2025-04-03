package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cytd extends ffhv implements ffjs {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ boolean c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    /* synthetic */ Object f;
    /* synthetic */ Object g;
    final /* synthetic */ cytf h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cytd(cytf cytfVar, ffgu ffguVar) {
        super(8, ffguVar);
        this.h = cytfVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [alxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r1 = this.a;
        ?? r2 = this.b;
        boolean z = this.c;
        Object obj2 = this.d;
        Object obj3 = this.e;
        Object obj4 = this.f;
        Object obj5 = this.g;
        cytl cytlVar = new cytl(((auxw) this.h.g.b()).a());
        if (z) {
            int i = engw.d;
            engw engwVar = enou.a;
            engwVar.getClass();
            return new cytm(engwVar, cytlVar);
        }
        if (this.h.h.a() && r1.u()) {
            ensk j = cytf.a.j();
            j.Y(ente.a, "BugleCdp");
            ((enrr) ((enrr) j).g(eldx.b(cytf.c)).h("com/google/android/apps/messaging/ui/conversation/details/header/actions/ActionsUiAdapterImpl$createUiData$1", "invokeSuspend", 92, "ActionsUiAdapterImpl.kt")).q("Attempting to open CDP header for a deleted conversation");
            return cytf.b;
        }
        if (!this.h.h.a()) {
            alxi b = r1.b();
            if (b != null && b.ordinal() == 2) {
                final cytf cytfVar = this.h;
                fffs fffsVar = new fffs((byte[]) null);
                if (obj3 != null) {
                    fffsVar.add(obj3);
                }
                if (obj4 != null) {
                    fffsVar.add(obj4);
                }
                if (obj5 != null) {
                    final dlsr dlsrVar = (dlsr) obj5;
                    if (dlsrVar.e) {
                        fffsVar.add(new dlsr(dlsrVar.a, dlsrVar.b, false, false, false, false, null, false, null, new ffix() { // from class: cyta
                            @Override // defpackage.ffix
                            public final Object invoke() {
                                dlsr.this.k.invoke();
                                ((cyuj) cytfVar.f.b()).a();
                                return ffcu.a;
                            }
                        }, 1020));
                    }
                }
                return new cytm(engq.a(ffdx.a(fffsVar)), cytlVar);
            }
            final cytf cytfVar2 = this.h;
            fffs fffsVar2 = new fffs((byte[]) null);
            if (obj2 != null && ((dlsr) obj2).e) {
                fffsVar2.add(obj2);
            }
            if (obj3 != null) {
                fffsVar2.add(obj3);
            }
            ((ResolvedRecipient) ffdx.T(r2)).A();
            String string = ((ResolvedRecipient) ffdx.T(r2)).A() ? cytfVar2.d.getString(R.string.show_contact_details) : cytfVar2.d.getString(R.string.add_contact_button);
            string.getClass();
            dmzz dmzzVar = ((ResolvedRecipient) ffdx.T(r2)).A() ? dmzz.n : dmzz.cK;
            final engw engwVar2 = (engw) r2;
            fffsVar2.add(new dlsr(string, dmzzVar, false, false, false, false, null, false, null, new ffix() { // from class: cytb
                @Override // defpackage.ffix
                public final Object invoke() {
                    Object T = ffdx.T(engwVar2);
                    T.getClass();
                    cytf.this.b((ResolvedRecipient) T);
                    return ffcu.a;
                }
            }, 1020));
            if (obj5 != null) {
                final dlsr dlsrVar2 = (dlsr) obj5;
                if (dlsrVar2.e) {
                    fffsVar2.add(new dlsr(dlsrVar2.a, dlsrVar2.b, false, false, false, false, null, false, null, new ffix() { // from class: cytc
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            dlsr.this.k.invoke();
                            ((cyuj) cytfVar2.f.b()).a();
                            return ffcu.a;
                        }
                    }, 1020));
                }
            }
            return new cytm(engq.a(ffdx.a(fffsVar2)), cytlVar);
        }
        alxi b2 = r1.b();
        if (b2 != null) {
            int ordinal = b2.ordinal();
            if (ordinal == 1) {
                final cytf cytfVar3 = this.h;
                fffs fffsVar3 = new fffs((byte[]) null);
                if (obj2 != null && ((dlsr) obj2).e) {
                    fffsVar3.add(obj2);
                }
                if (obj3 != null) {
                    fffsVar3.add(obj3);
                }
                ((ResolvedRecipient) ffdx.T(r2)).A();
                String string2 = ((ResolvedRecipient) ffdx.T(r2)).A() ? cytfVar3.d.getString(R.string.show_contact_details) : cytfVar3.d.getString(R.string.add_contact_button);
                string2.getClass();
                dmzz dmzzVar2 = ((ResolvedRecipient) ffdx.T(r2)).A() ? dmzz.n : dmzz.cK;
                final engw engwVar3 = (engw) r2;
                fffsVar3.add(new dlsr(string2, dmzzVar2, false, false, false, false, null, false, null, new ffix() { // from class: cysy
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        Object T = ffdx.T(engwVar3);
                        T.getClass();
                        cytf.this.b((ResolvedRecipient) T);
                        return ffcu.a;
                    }
                }, 1020));
                final dlsr dlsrVar3 = (dlsr) obj5;
                if (dlsrVar3.e) {
                    fffsVar3.add(new dlsr(dlsrVar3.a, dlsrVar3.b, false, false, false, false, null, false, null, new ffix() { // from class: cysz
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            dlsr.this.k.invoke();
                            ((cyuj) cytfVar3.f.b()).a();
                            return ffcu.a;
                        }
                    }, 1020));
                }
                return new cytm(engq.a(ffdx.a(fffsVar3)), cytlVar);
            }
            if (ordinal == 2) {
                final cytf cytfVar4 = this.h;
                fffs fffsVar4 = new fffs((byte[]) null);
                if (obj3 != null) {
                    fffsVar4.add(obj3);
                }
                if (obj4 != null) {
                    fffsVar4.add(obj4);
                }
                final dlsr dlsrVar4 = (dlsr) obj5;
                if (dlsrVar4.e) {
                    fffsVar4.add(new dlsr(dlsrVar4.a, dlsrVar4.b, false, false, false, false, null, false, null, new ffix() { // from class: cysx
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            dlsr.this.k.invoke();
                            ((cyuj) cytfVar4.f.b()).a();
                            return ffcu.a;
                        }
                    }, 1020));
                }
                return new cytm(engq.a(ffdx.a(fffsVar4)), cytlVar);
            }
            if (ordinal == 3 || ordinal == 4) {
                ensk j2 = cytf.a.j();
                j2.Y(ente.a, "BugleCdp");
                ((enrr) ((enrr) j2).g(eldx.b(cytf.c)).h("com/google/android/apps/messaging/ui/conversation/details/header/actions/ActionsUiAdapterImpl$createUiData$1", "invokeSuspend", 169, "ActionsUiAdapterImpl.kt")).q("Attempting to open CDP for unsupported RBM/Business conversation");
                return cytf.b;
            }
        }
        ensk j3 = cytf.a.j();
        j3.Y(ente.a, "BugleCdp");
        ((enrr) ((enrr) j3).g(eldx.b(cytf.c)).h("com/google/android/apps/messaging/ui/conversation/details/header/actions/ActionsUiAdapterImpl$createUiData$1", "invokeSuspend", 176, "ActionsUiAdapterImpl.kt")).q("Attempting to open CDP for unknown conversation kind");
        return cytf.b;
    }

    @Override // defpackage.ffjs
    public final /* bridge */ /* synthetic */ Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        cytd cytdVar = new cytd(this.h, (ffgu) obj8);
        cytdVar.a = (alxj) obj;
        cytdVar.b = (engw) obj2;
        cytdVar.c = booleanValue;
        cytdVar.d = (dlsr) obj4;
        cytdVar.e = (dlsr) obj5;
        cytdVar.f = (dlsr) obj6;
        cytdVar.g = (dlsr) obj7;
        return cytdVar.b(ffcu.a);
    }
}
