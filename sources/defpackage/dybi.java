package defpackage;

import android.accounts.Account;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dybi implements duhb {
    public final emyl a;
    private final emyl b;
    private final emyl c;

    public dybi(dybh dybhVar) {
        this.b = dybhVar.a;
        this.c = dybhVar.b;
        this.a = dybhVar.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.duhb
    public final long a(emxc emxcVar, final String str, eyns eynsVar) {
        if (!((Boolean) ((emyr) this.c).a).booleanValue()) {
            return 0L;
        }
        if ((eynsVar.b & 1) == 0) {
            throw new IllegalStateException("DataType is a required field in GellerDeleteParams.");
        }
        String str2 = eynsVar.e;
        final dwqs dwqsVar = (dwqs) dybu.a.getOrDefault(str2, dwqs.GDD_UNKNOWN);
        emxf.p(!dwqsVar.equals(dwqs.GDD_UNKNOWN), "GellerGddStorage does not support deletion for corpus: %s", str2);
        try {
            return ((dwxe) elfr.k(this.b.get(), new eroh() { // from class: dybf
                /* JADX WARN: Type inference failed for: r0v3, types: [dwub, java.lang.Object] */
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final String str3 = str;
                    Account account = (Account) enjk.g((List) obj, new emxg() { // from class: dybg
                        @Override // defpackage.emxg
                        public final boolean a(Object obj2) {
                            return ((Account) obj2).name.equals(str3);
                        }
                    });
                    return dybi.this.a.get().i(new dwol(emxc.j(dwqsVar), emxc.j(account)));
                }
            }, erpp.a).get(3000L, TimeUnit.MILLISECONDS)).a();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Unable to remove account file groups", e.getCause());
        } catch (ExecutionException e2) {
            e = e2;
            throw new IllegalStateException("Unable to remove account file groups", e.getCause());
        } catch (TimeoutException e3) {
            e = e3;
            throw new IllegalStateException("Unable to remove account file groups", e.getCause());
        }
    }

    @Override // defpackage.duhb
    public final /* synthetic */ eynk b(emxc emxcVar, Set set) {
        return eynk.a;
    }

    @Override // defpackage.duhb
    public final ezic c() {
        return ezic.CUSTOM_STORAGE_TYPE_GDD;
    }

    @Override // defpackage.duhb
    public final byte[][] d(emxc emxcVar, eyoy eyoyVar) {
        return new byte[0][];
    }

    @Override // defpackage.duhb
    public final String[] e(emxc emxcVar, String str) {
        return new String[0];
    }

    @Override // defpackage.duhb
    public final long f(emxc emxcVar, String str, eyoj eyojVar, emxc emxcVar2, emxc emxcVar3, emxc emxcVar4) {
        return 0L;
    }

    @Override // defpackage.duhb
    public final boolean g(emxc emxcVar, String str, String[] strArr, long j, boolean z, byte[] bArr) {
        return true;
    }

    @Override // defpackage.duhb
    public final eypp h(emxc emxcVar, String str, String[] strArr, long j, boolean z, byte[] bArr) {
        return eypp.a;
    }

    @Override // defpackage.duhb
    public final /* synthetic */ boolean i(emxc emxcVar, eypl eyplVar) {
        return duha.a(this, emxcVar, eyplVar);
    }
}
