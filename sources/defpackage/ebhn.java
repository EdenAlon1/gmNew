package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ebhn extends ebgb {
    public final eave a;
    public final dgqq c;
    public final emxc d;
    public final String e;
    public ebhb h;
    public Object i;
    public ebhe j;
    public String k;
    public boolean m;
    public final emxc n;
    public final ljv f = new ebhl(this);
    public final ljv g = new ebhm(this);
    public enhk l = enoz.a;
    public final dgqs b = new dgqs() { // from class: ebhf
        @Override // defpackage.dgqs
        public final void a(Map map) {
            ebhn ebhnVar = ebhn.this;
            enhk j = enhk.j(map);
            ebhnVar.l = j;
            ebhnVar.a(ebhnVar.i, j, ebhnVar.h, ebhnVar.m);
            ebhe ebheVar = ebhnVar.j;
            if (ebheVar != null) {
                ebheVar.b(ebhnVar.l);
            }
        }
    };

    protected ebhn(eave eaveVar, dgqq dgqqVar, emxc emxcVar, String str, emxc emxcVar2) {
        this.a = eaveVar;
        this.c = dgqqVar;
        this.d = emxcVar;
        this.e = str;
        this.n = emxcVar2;
    }

    public final void a(Object obj, enhk enhkVar, ebhb ebhbVar, boolean z) {
        int a;
        if (ebhbVar == null) {
            return;
        }
        ewov ewovVar = z ? null : (ewov) emxc.i((dgqi) ebkp.a(this.a, obj, enhkVar, null)).b(new emwl() { // from class: ebhg
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                ewox ewoxVar = ((dgqi) obj2).b;
                return ewoxVar == null ? ewox.a : ewoxVar;
            }
        }).b(new emwl() { // from class: ebhh
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                ewov ewovVar2 = ((ewox) obj2).c;
                return ewovVar2 == null ? ewov.a : ewovVar2;
            }
        }).f();
        ebhbVar.A = new ksp() { // from class: ebhi
            @Override // defpackage.ksp
            public final void accept(Object obj2) {
                ebhn.this.k = (String) obj2;
            }
        };
        ebhbVar.B = ewovVar;
        boolean z2 = false;
        if (ewovVar != null && (a = ewot.a(ewovVar.b)) != 0 && a == 4) {
            z2 = true;
        }
        ebhbVar.n(z2);
    }
}
