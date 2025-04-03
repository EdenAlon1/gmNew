package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enah<K, V> extends enai<K, V> implements emzl<K, V> {
    private static final long serialVersionUID = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enah(emzf emzfVar, emzi emziVar) {
        super(new enbf(emzfVar, emziVar));
        emziVar.getClass();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use LoadingSerializationProxy");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0236, code lost:
    
        r4.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0223, code lost:
    
        if (r9.d() != r5) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0225, code lost:
    
        r5.f();
        r6.set(r7, r4.e(r8, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x022f, code lost:
    
        r4.unlock();
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0131 A[Catch: all -> 0x01dc, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x01dc, blocks: (B:48:0x0131, B:68:0x018f, B:72:0x01a7, B:77:0x01c9, B:79:0x01d5, B:80:0x01db, B:81:0x01df, B:82:0x01ec, B:50:0x0137, B:52:0x014a, B:53:0x0151, B:55:0x0163, B:58:0x016f, B:61:0x0179, B:64:0x0185, B:67:0x018a, B:71:0x0196, B:74:0x01af, B:76:0x01b4), top: B:46:0x012f, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01df A[Catch: all -> 0x01dc, TryCatch #6 {all -> 0x01dc, blocks: (B:48:0x0131, B:68:0x018f, B:72:0x01a7, B:77:0x01c9, B:79:0x01d5, B:80:0x01db, B:81:0x01df, B:82:0x01ec, B:50:0x0137, B:52:0x014a, B:53:0x0151, B:55:0x0163, B:58:0x016f, B:61:0x0179, B:64:0x0185, B:67:0x018a, B:71:0x0196, B:74:0x01af, B:76:0x01b4), top: B:46:0x012f, inners: #3 }] */
    @Override // defpackage.emzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enah.a(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.emwl
    public final V apply(K k) {
        return (V) e(k);
    }

    public final Object e(Object obj) {
        try {
            return a(obj);
        } catch (ExecutionException e) {
            throw new ersm(e.getCause());
        }
    }

    @Override // defpackage.enai
    Object writeReplace() {
        return new enaf(this.a);
    }
}
