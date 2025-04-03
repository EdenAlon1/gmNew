package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctnx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ctof b;
    final /* synthetic */ engr c;
    final /* synthetic */ albb d;
    final /* synthetic */ fbtu e;
    final /* synthetic */ boolean f;
    final /* synthetic */ emmp g;
    final /* synthetic */ MessageCoreData h;
    Object i;
    final /* synthetic */ ctin j;
    private /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctnx(ffgu ffguVar, ctof ctofVar, engr engrVar, albb albbVar, ctin ctinVar, fbtu fbtuVar, boolean z, emmp emmpVar, MessageCoreData messageCoreData) {
        super(2, ffguVar);
        this.b = ctofVar;
        this.c = engrVar;
        this.d = albbVar;
        this.j = ctinVar;
        this.e = fbtuVar;
        this.f = z;
        this.g = emmpVar;
        this.h = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctnx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        albb a;
        ffhh ffhhVar = ffhh.a;
        ?? r1 = this.a;
        try {
            try {
                if (r1 != 0) {
                    Object obj2 = this.i;
                    a = (albb) this.k;
                    ffci.b(obj);
                    r1 = obj2;
                } else {
                    ffci.b(obj);
                    a = ((alba) this.b.g.b()).a();
                    ekzz f = eleg.f("SmartSuggestionRequesterImpl#parseResponse");
                    ffhd a2 = ekxi.a(this.b.c);
                    ctnz ctnzVar = new ctnz(null, this.b, this.e, this.f, this.g, this.h, this.j);
                    this.k = a;
                    this.i = f;
                    this.a = 1;
                    obj = ffra.a(a2, ctnzVar, this);
                    r1 = f;
                    if (obj == ffhhVar) {
                        return ffhhVar;
                    }
                }
                ctin ctinVar = (ctin) obj;
                ffig.a(r1, null);
                this.c.h(ctof.j(7, a.a()));
                this.c.h(ctof.j(3, this.d.a()));
                ctin ctinVar2 = this.j;
                engw g = this.c.g();
                g.getClass();
                ctinVar2.e = g;
                ctinVar2.f = (byte) (ctinVar2.f | 16);
                return ctinVar.a();
            } finally {
            }
        } catch (Throwable th) {
            this.c.h(ctof.j(7, a.a()));
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctnx ctnxVar = new ctnx(ffguVar, this.b, this.c, this.d, this.j, this.e, this.f, this.g, this.h);
        ctnxVar.k = obj;
        return ctnxVar;
    }
}
