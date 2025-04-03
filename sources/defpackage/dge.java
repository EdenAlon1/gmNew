package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class dge extends ffkh implements ffjm {
    public dge(Object obj) {
        super(2, obj, dgh.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        boolean b;
        hzo hzoVar = (hzo) obj;
        hzo hzoVar2 = (hzo) obj2;
        dgh dghVar = (dgh) this.g;
        if (dghVar.z && (b = hzoVar2.b()) != hzoVar.b()) {
            ffji ffjiVar = dghVar.a;
            if (ffjiVar != null) {
                ffjiVar.invoke(Boolean.valueOf(b));
            }
            if (b) {
                ffqy.d(dghVar.D(), null, null, new dgf(dghVar, null), 3);
                ejy i = dghVar.i();
                if (i != null) {
                    i.c();
                } else {
                    i = null;
                }
                dghVar.e = i;
                dghVar.f();
            } else {
                ejy ejyVar = dghVar.e;
                if (ejyVar != null) {
                    ejyVar.a();
                }
                dghVar.e = null;
                dgj b2 = dghVar.b();
                if (b2 != null) {
                    b2.a(null);
                }
            }
            ixo.a(dghVar);
            dwn dwnVar = dghVar.d;
            if (dwnVar != null) {
                if (b) {
                    dwf dwfVar = dghVar.b;
                    if (dwfVar != null) {
                        dghVar.j(dwnVar, new dwg(dwfVar));
                        dghVar.b = null;
                    }
                    dwf dwfVar2 = new dwf();
                    dghVar.j(dwnVar, dwfVar2);
                    dghVar.b = dwfVar2;
                } else {
                    dwf dwfVar3 = dghVar.b;
                    if (dwfVar3 != null) {
                        dghVar.j(dwnVar, new dwg(dwfVar3));
                        dghVar.b = null;
                    }
                }
            }
        }
        return ffcu.a;
    }
}
