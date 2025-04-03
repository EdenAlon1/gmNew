package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cozs implements cowk {
    private final eikl a;
    private final avtx b;
    private final ffbr c;

    public cozs(eikl eiklVar, avtx avtxVar, ffbr ffbrVar) {
        this.a = eiklVar;
        this.b = avtxVar;
        this.c = ffbrVar;
    }

    @Override // defpackage.cowk
    public final elfl a(awvd awvdVar, MessageCoreData messageCoreData, avkl avklVar) {
        avtz avtzVar = new avtz();
        awvb awvbVar = awvdVar.c;
        if (awvbVar == null) {
            awvbVar = awvb.a;
        }
        FileInformation fileInformation = (FileInformation) avtzVar.fP(awvbVar);
        MessagePartCoreData G = messageCoreData.G();
        if (G != null && G.ba()) {
            eifi c = fileInformation.c();
            c.b(Duration.ofMillis(G.k()));
            fileInformation = c.i();
        }
        eieg eiegVar = new eieg();
        eiegVar.c(fileInformation);
        if ((awvdVar.b & 2) != 0) {
            awvb awvbVar2 = awvdVar.d;
            if (awvbVar2 == null) {
                awvbVar2 = awvb.a;
            }
            eiegVar.e((FileInformation) avtzVar.fP(awvbVar2));
        }
        try {
            eijp b = this.a.b(FileTransferInformation.class).b(eiegVar.a());
            ((akzt) this.c.b()).e("Bugle.Etouffee.FileTransfer.Format.Outgoing", covi.a(5));
            return elfo.e((awul) this.b.fP(b));
        } catch (eikm e) {
            throw new cowg(e);
        }
    }
}
