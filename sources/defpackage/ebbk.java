package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebbk {
    public static final /* synthetic */ int a = 0;
    private static final enom b;
    private final ebbb c;
    private boolean d;

    static {
        int i = 0;
        enkh enkhVar = new enkh(ebfm.INCOGNITO, new ebfm[]{ebfm.PRIVACY_ADVISOR, ebfm.SETTINGS, ebfm.HELP_AND_FEEDBACK});
        enhd enhdVar = new enhd(enkhVar.size());
        Iterator<E> it = enkhVar.iterator();
        while (it.hasNext()) {
            enhdVar.k(it.next(), Integer.valueOf(i));
            i++;
        }
        b = new enew(enhdVar.c());
    }

    public ebbk(ebbb ebbbVar) {
        this.c = ebbbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final engw a() {
        engr engrVar = new engr();
        ArrayList arrayList = new ArrayList();
        engw engwVar = ((ebgd) ((ebbg) this.c).e).j;
        for (int i = 0; i < ((enou) engwVar).c; i++) {
            ebfp ebfpVar = (ebfp) engwVar.get(i);
            ebfm g = ebfpVar.g();
            emxf.l(!g.equals(ebfm.CUSTOM));
            if (!this.d || !g.equals(ebfm.PRIVACY_ADVISOR)) {
                arrayList.add(ebfpVar);
            }
        }
        engw E = engw.E(new ebbj(b), arrayList);
        int i2 = ((enou) E).c;
        for (int i3 = 0; i3 < i2; i3++) {
            final ebfp ebfpVar2 = (ebfp) E.get(i3);
            engrVar.h(new ebcn(new ebcx() { // from class: ebbi
                @Override // defpackage.ebcx
                public final ebdf a(Object obj) {
                    int i4 = ebbk.a;
                    ebcm ebcmVar = new ebcm(ebfp.this);
                    ebcmVar.j(ebef.COMMON_ACTION_CARD);
                    return ebcmVar;
                }
            }));
        }
        return engrVar.g();
    }

    public final void b() {
        this.d = true;
    }
}
