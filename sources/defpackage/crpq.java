package defpackage;

import com.google.android.gms.auth.folsom.SharedKey;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crpq implements crpo {
    private final ffbr a;
    private final engw b;
    private final etfk c;

    /* JADX WARN: Multi-variable type inference failed */
    public crpq(ffbr ffbrVar, engw engwVar) {
        this.a = ffbrVar;
        this.b = engwVar;
        etgo.a();
        etfy etfyVar = new etfy();
        enqv it = engwVar.iterator();
        it.getClass();
        while (it.hasNext()) {
            SharedKey sharedKey = (SharedKey) it.next();
            sharedKey.getClass();
            eujv c = eujv.c(sharedKey.b);
            ethu ethuVar = new ethu();
            ethuVar.d();
            ethuVar.c(c.a());
            ethuVar.b();
            ethp a = etho.a(ethuVar.a(), c, null);
            etfw etfwVar = new etfw(a);
            Integer num = a.d;
            if (num != null) {
                etfwVar.b(num.intValue());
            }
            etfwVar.b(sharedKey.a);
            etfyVar.c(etfwVar);
        }
        ((etfw) etfyVar.a.get(0)).a();
        this.c = (etfk) etfyVar.a().f(etth.a, etfk.class);
    }

    @Override // defpackage.crpo
    public final eyee a(eyee eyeeVar) {
        eyeeVar.getClass();
        try {
            eyee x = eyee.x(this.c.a(eyeeVar.I(), null));
            ((akzt) this.a.b()).c("Bugle.Gms.Folsom.Cryptor.Decryption.Succeeded.Count");
            return x;
        } catch (GeneralSecurityException e) {
            ((akzt) this.a.b()).c("Bugle.Gms.Folsom.Cryptor.Decryption.Failed.Count");
            throw e;
        }
    }

    @Override // defpackage.crpo
    public final eyee b(eyee eyeeVar) {
        try {
            eyee x = eyee.x(this.c.b(eyeeVar.I(), null));
            ((akzt) this.a.b()).c("Bugle.Gms.Folsom.Cryptor.Encryption.Succeeded.Count");
            return x;
        } catch (GeneralSecurityException e) {
            ((akzt) this.a.b()).c("Bugle.Gms.Folsom.Cryptor.Encryption.Failed.Count");
            throw e;
        }
    }
}
