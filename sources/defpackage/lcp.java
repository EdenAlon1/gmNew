package defpackage;

import java.io.FileOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lcp extends ffhv implements ffji {
    Object a;
    Object b;
    int c;
    final /* synthetic */ lcq d;
    final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lcp(lcq lcqVar, Object obj, ffgu ffguVar) {
        super(1, ffguVar);
        this.d = lcqVar;
        this.e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        ?? r1 = this.c;
        try {
            if (r1 != 0) {
                obj2 = this.b;
                Object obj3 = this.a;
                ffci.b(obj);
                r1 = obj3;
            } else {
                ffci.b(obj);
                FileOutputStream fileOutputStream = new FileOutputStream(this.d.a);
                Object obj4 = this.e;
                ldm ldmVar = new ldm(fileOutputStream);
                this.a = fileOutputStream;
                this.b = fileOutputStream;
                this.c = 1;
                ((eyhs) obj4).writeTo(ldmVar);
                if (ffcu.a == ffhhVar) {
                    return ffhhVar;
                }
                obj2 = fileOutputStream;
                r1 = fileOutputStream;
            }
            ((FileOutputStream) obj2).getFD().sync();
            ffig.a(r1, null);
            return ffcu.a;
        } finally {
        }
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new lcp(this.d, this.e, (ffgu) obj).b(ffcu.a);
    }
}
