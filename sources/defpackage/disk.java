package defpackage;

import android.telephony.TelephonyManager;
import com.google.android.ims.filetransfer.http.runnable.GbaBootstrapAuthenticationException;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Base64;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class disk extends TelephonyManager.BootstrapAuthenticationCallback {
    final /* synthetic */ SettableFuture a;
    final /* synthetic */ disn b;

    public disk(disn disnVar, SettableFuture settableFuture) {
        this.a = settableFuture;
        this.b = disnVar;
    }

    public final void onAuthenticationFailure(int i) {
        eyue eyueVar = (eyue) eyuj.a.createBuilder();
        eyueVar.copyOnWrite();
        eyuj eyujVar = (eyuj) eyueVar.instance;
        eyujVar.c = 1;
        eyujVar.b |= 1;
        eyueVar.copyOnWrite();
        eyuj eyujVar2 = (eyuj) eyueVar.instance;
        eyujVar2.d = 3;
        eyujVar2.b |= 2;
        int a = eyuh.a(i);
        if (a == 0) {
            a = 1;
        }
        disn disnVar = this.b;
        eyueVar.copyOnWrite();
        eyuj eyujVar3 = (eyuj) eyueVar.instance;
        eyujVar3.e = a - 1;
        eyujVar3.b |= 4;
        disnVar.a.a(4, (eyuj) eyueVar.build());
        dkty.g("[SR] GBA authentication FAILURE: %d.", Integer.valueOf(i));
        this.a.setException(new GbaBootstrapAuthenticationException(i));
    }

    public final void onKeysAvailable(byte[] bArr, String str) {
        eyue eyueVar = (eyue) eyuj.a.createBuilder();
        eyueVar.copyOnWrite();
        eyuj eyujVar = (eyuj) eyueVar.instance;
        eyujVar.c = 1;
        eyujVar.b |= 1;
        eyueVar.copyOnWrite();
        eyuj eyujVar2 = (eyuj) eyueVar.instance;
        eyujVar2.d = 1;
        eyujVar2.b |= 2;
        this.b.a.a(3, (eyuj) eyueVar.build());
        dkty.k("[SR] GBA authentication SUCCESS: obtained gbaKey and btId.", new Object[0]);
        int i = disl.a;
        this.a.set(new dird(new dire(str), Base64.getEncoder().encodeToString(bArr)));
    }
}
