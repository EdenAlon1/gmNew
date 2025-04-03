package defpackage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baqz extends ffhv implements ffjm {
    final /* synthetic */ bara a;
    final /* synthetic */ byte[] b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baqz(ffgu ffguVar, bara baraVar, byte[] bArr) {
        super(2, ffguVar);
        this.a = baraVar;
        this.b = bArr;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((baqz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        File file;
        ffci.b(obj);
        if (!this.a.N.q()) {
            return ffcu.a;
        }
        if (((cvjg) this.a.K.b()).a()) {
            return ffcu.a;
        }
        bara baraVar = this.a;
        byte[] bArr = this.b;
        if (bArr == null || bArr.length <= 0) {
            file = null;
        } else {
            covp covpVar = baraVar.M;
            file = covpVar.b("mmsdump-_corrupt_wappush_" + covpVar.c(null) + "_email", engw.r(bArr));
        }
        if (file == null) {
            ((enrr) bara.b.i().h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveMmsMessageAsyncAction$saveAndNotifyMalformedPdu$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 898, "ReceiveMmsMessageAsyncAction.kt")).q("Attempted to dump a null pdu");
            return ffcu.a;
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(cflz.e(this.a.d, file.getName())));
            try {
                bufferedOutputStream.write(this.b);
                ffig.a(bufferedOutputStream, null);
            } finally {
            }
        } catch (IOException e) {
            ((enrr) ((enrr) bara.b.i()).g(e).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveMmsMessageAsyncAction$saveAndNotifyMalformedPdu$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 913, "ReceiveMmsMessageAsyncAction.kt")).q("Error writing wap push raw data");
        }
        ((enrr) bara.b.h().h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveMmsMessageAsyncAction$saveAndNotifyMalformedPdu$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 918, "ReceiveMmsMessageAsyncAction.kt")).q("Enqueuing SharePdu notification for pdu that we failed to persist.");
        ciwj ciwjVar = (ciwj) this.a.G.b();
        civa civaVar = (civa) this.a.Q.b();
        cjcu cjcuVar = (cjcu) cjcv.a.createBuilder();
        String name = file.getName();
        cjcuVar.copyOnWrite();
        cjcv cjcvVar = (cjcv) cjcuVar.instance;
        name.getClass();
        cjcvVar.b |= 1;
        cjcvVar.c = name;
        ciwjVar.c(civaVar, cjcuVar.build(), false);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        baqz baqzVar = new baqz(ffguVar, this.a, this.b);
        baqzVar.c = obj;
        return baqzVar;
    }
}
