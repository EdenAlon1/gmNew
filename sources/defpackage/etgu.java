package defpackage;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etgu implements etfk {
    private final etgt a;
    private final etss b;

    public etgu(etgt etgtVar, etss etssVar) {
        this.a = etgtVar;
        this.b = etssVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [etsp] */
    @Override // defpackage.etfk
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        etss etssVar = this.b;
        List<etgt> list = (List) etssVar.b.get(etss.a);
        List list2 = bArr.length >= 5 ? (List) etssVar.b.get(eujt.d(bArr, 5)) : null;
        if (list == null && list2 == null) {
            list = new ArrayList();
        } else if (list == null) {
            list = list2;
        } else if (list2 != null) {
            list = new etsp(list2, list);
        }
        for (etgt etgtVar : list) {
            try {
                byte[] a = etgtVar.a.a(bArr, null);
                int i = etgtVar.b;
                int length = bArr.length;
                return a;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // defpackage.etfk
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] b = this.a.a.b(bArr, null);
        int length = bArr.length;
        return b;
    }
}
