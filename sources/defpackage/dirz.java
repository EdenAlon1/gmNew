package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dirz {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;

    public dirz(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
        this.f = ffbrVar6;
    }

    public final diry a(long j, String str, String str2, FileTransferInfo fileTransferInfo, InstantMessageConfiguration instantMessageConfiguration, diuc diucVar, boolean z, dijy dijyVar, disr disrVar, String str3) {
        Context context = (Context) this.a.b();
        dips dipsVar = (dips) this.b.b();
        djqt djqtVar = (djqt) this.c.b();
        str.getClass();
        str2.getClass();
        fileTransferInfo.getClass();
        instantMessageConfiguration.getClass();
        diucVar.getClass();
        return new diry(context, dipsVar, djqtVar, this.f, j, str, str2, fileTransferInfo, instantMessageConfiguration, diucVar, z, dijyVar, disrVar, str3);
    }
}
