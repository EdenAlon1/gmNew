package defpackage;

import android.content.Context;
import android.media.MediaExtractor;
import android.net.Uri;
import android.os.PersistableBundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shh implements bdod, bdns, bdnt {
    public static final byte[] a = {-103, 57, 118, 99, -72, -91, -42, -58};
    public static final entd b = entd.c("BugleAudio");
    public final Context c;
    public final ffsk d;
    public final bbfo e;
    private final dtuu f;
    private final ffbr g;

    public shh(Context context, ffsk ffskVar, dtuu dtuuVar, bbfo bbfoVar, ffbr ffbrVar) {
        context.getClass();
        ffskVar.getClass();
        dtuuVar.getClass();
        bbfoVar.getClass();
        ffbrVar.getClass();
        this.c = context;
        this.d = ffskVar;
        this.f = dtuuVar;
        this.e = bbfoVar;
        this.g = ffbrVar;
    }

    private final void n(MessageCoreData messageCoreData, ffjm ffjmVar) {
        MessagePartCoreData G;
        Uri t;
        if (!j() || (G = messageCoreData.G()) == null || (t = G.t()) == null || !G.ba()) {
            return;
        }
        ffjmVar.a(G, t);
    }

    @Override // defpackage.bdod
    public final Object a(MessageCoreData messageCoreData, ffgu ffguVar) {
        ekzz f = eleg.f("AudioMulitplexedMetadataListener::onBeforeInsertion");
        try {
            n(messageCoreData, new ffjm() { // from class: shd
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
                    byte[] bArr = shh.a;
                    messagePartCoreData.getClass();
                    ((Uri) obj2).getClass();
                    messagePartCoreData.aE(Uri.EMPTY);
                    return ffcu.a;
                }
            });
            ffig.a(f, null);
            return messageCoreData;
        } finally {
        }
    }

    @Override // defpackage.bdnt
    public final void c(final MessageCoreData messageCoreData) {
        n(messageCoreData, new ffjm() { // from class: sha
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                Uri uri = (Uri) obj2;
                ((MessagePartCoreData) obj).getClass();
                uri.getClass();
                shh shhVar = shh.this;
                axol.k(shhVar.d, null, new she(shhVar, messageCoreData, uri, null), 3);
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.bdod
    public final void f(final MessageCoreData messageCoreData, MessageIdType messageIdType) {
        messageCoreData.getClass();
        messageIdType.getClass();
        if (messageCoreData.cu()) {
            n(messageCoreData, new ffjm() { // from class: shb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
                    Uri uri = (Uri) obj2;
                    messagePartCoreData.getClass();
                    uri.getClass();
                    shh shhVar = shh.this;
                    axol.k(shhVar.d, null, new shg(shhVar, uri, messagePartCoreData, messageCoreData, null), 3);
                    return ffcu.a;
                }
            });
        }
    }

    @Override // defpackage.bdns
    public final void gc(final MessageCoreData messageCoreData) {
        n(messageCoreData, new ffjm() { // from class: sgz
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                Uri uri = (Uri) obj2;
                ((MessagePartCoreData) obj).getClass();
                uri.getClass();
                shh shhVar = shh.this;
                axol.k(shhVar.d, null, new shf(shhVar, messageCoreData, uri, null), 3);
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.bdod
    public final boolean j() {
        Object e = ardj.f.e();
        e.getClass();
        return ((Boolean) e).booleanValue();
    }

    public final void k(String str, boolean z) {
        ((akzt) this.g.b()).c(str.concat(true != z ? ".Mms" : ".Rcs"));
    }

    public final void l(final Uri uri, final String str, final MessageIdType messageIdType) {
        this.f.d("AudioMultiplexedMetadataListener#updateContentUriAndStatus", new Runnable() { // from class: shc
            @Override // java.lang.Runnable
            public final void run() {
                byte[] bArr = shh.a;
                String[] strArr = PartsTable.a;
                bwdi bwdiVar = new bwdi();
                bwdiVar.ap("updateContentUriAndStatus-parts");
                bwdiVar.z(uri);
                bwdiVar.c(str);
                String[] strArr2 = MessagesTable.a;
                buxr buxrVar = new buxr();
                buxrVar.ap("updateContentUriAndStatus-messages");
                buxrVar.U(4);
                buxrVar.e(messageIdType);
            }
        });
    }

    public final void m(MessageCoreData messageCoreData, Uri uri) {
        PersistableBundle metrics;
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            mediaExtractor.setDataSource(this.c, uri, (Map<String, String>) null);
            metrics = mediaExtractor.getMetrics();
            if (ffkj.e("audio/mp4", metrics.getString("android.media.mediaextractor.mime"))) {
                int trackCount = mediaExtractor.getTrackCount();
                int i = 0;
                while (true) {
                    if (i >= trackCount) {
                        break;
                    }
                    if (ffkj.e("application/am-mm-validation", mediaExtractor.getTrackFormat(i).getString("mime"))) {
                        mediaExtractor.selectTrack(i);
                        ByteBuffer allocate = ByteBuffer.allocate(4096);
                        int readSampleData = mediaExtractor.readSampleData(allocate, 0);
                        if (readSampleData > 0) {
                            byte[] bArr = new byte[readSampleData];
                            allocate.rewind();
                            allocate.get(bArr);
                            if (Arrays.equals(a, bArr)) {
                                k("Bugle.MultiplexedMetadata.Received.Valid.Count", messageCoreData.cX());
                            } else {
                                k("Bugle.MultiplexedMetadata.Received.Invalid.Count", messageCoreData.cX());
                            }
                        } else {
                            k("Bugle.MultiplexedMetadata.Received.Invalid.Count", messageCoreData.cX());
                        }
                    } else {
                        i++;
                    }
                }
            }
        } finally {
            mediaExtractor.release();
        }
    }

    @Override // defpackage.bdns
    public final /* synthetic */ void e(String str) {
    }

    @Override // defpackage.bdns
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void h(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void i(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdod
    public final /* synthetic */ Object b(MessageCoreData messageCoreData, List list, ffgu ffguVar) {
        return messageCoreData;
    }
}
