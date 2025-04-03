package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessDownloadedMmsAction;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceqt extends ceut {
    public static final cskc a = cskc.g("BugleDataModel", "DownloadMmsHandler");
    public final Context b;
    public final cqoh c;
    public final ffbr d;
    public final coxk e;
    public final axmw f;
    public final ffbr g;
    public final baky h;
    private final errl i;

    public ceqt(Context context, errl errlVar, cqoh cqohVar, ffbr ffbrVar, coxk coxkVar, baky bakyVar, axmw axmwVar, ffbr ffbrVar2) {
        this.b = context;
        this.i = errlVar;
        this.c = cqohVar;
        this.d = ffbrVar;
        this.e = coxkVar;
        this.h = bakyVar;
        this.f = axmwVar;
        this.g = ffbrVar2;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        ((ceti) l).c = eogt.DOWNLOAD_MMS_ACTION;
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("DownloadMmsHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ceqv.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final ceqv ceqvVar = (ceqv) eyhsVar;
        return elfo.g(new Callable() { // from class: ceqs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ceqv ceqvVar2;
                ceqv ceqvVar3 = ceqvVar;
                ceqt ceqtVar = ceqt.this;
                try {
                    int i = ceqvVar3.i;
                    MessageIdType b = bdhb.b(ceqvVar3.c);
                    Uri parse = Uri.parse(ceqvVar3.h);
                    String str = ceqvVar3.j;
                    String str2 = ceqvVar3.g;
                    String str3 = ceqvVar3.f;
                    boolean z = ceqvVar3.k;
                    ConversationIdType b2 = bdgq.b(ceqvVar3.d);
                    String str4 = ceqvVar3.e;
                    int i2 = ceqvVar3.l;
                    int i3 = ceqvVar3.m;
                    long j = (ceqvVar3.b & 4096) != 0 ? ceqvVar3.o : 0L;
                    long a2 = azyz.a(ceqtVar.c.f().toEpochMilli());
                    Uri parse2 = TextUtils.isEmpty(str3) ? Uri.EMPTY : Uri.parse(str3);
                    String b3 = emxe.b(MessageData.ax(i3));
                    csjb c = ceqt.a.c();
                    c.I("Downloading message.");
                    c.I(b3);
                    c.o(b, b2);
                    c.I("autoDownload:");
                    c.J(z);
                    c.v(", contentLocation:");
                    c.l(parse2);
                    c.r();
                    if (MessageData.cx(i3)) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("status_if_failed", i2);
                        bundle.putBoolean("auto_download", z);
                        ceqtVar.f.c(ceqtVar.b, ceqvVar3.n, bundle);
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("message_id", b.b());
                        bundle2.putString("conversation_id", b2.toString());
                        bundle2.putString("participant_id", str4);
                        bundle2.putInt("status_if_failed", i2);
                        bundle2.putLong("message_logging_id", j);
                        ((altk) ceqtVar.d.b()).S(b2, i, j);
                        ceqvVar2 = ceqvVar3;
                        try {
                            ckbx q = ceqtVar.e.q(ceqtVar.b, parse, i, str, str2, parse2, z, a2 / 1000, bundle2, j);
                            if (q == ckbx.i) {
                                csjb a3 = ceqt.a.a();
                                a3.I("Downloading MMS message asynchronously, waiting for pending intent.");
                                a3.o(b, b2);
                                a3.r();
                            } else {
                                ((coxg) ceqtVar.g.b()).i(a2);
                                baky bakyVar = ceqtVar.h;
                                int i4 = ((ckax) q).e;
                                parse.getClass();
                                str4.getClass();
                                parse2.getClass();
                                str.getClass();
                                str2.getClass();
                                new ProcessDownloadedMmsAction(bakyVar.d, bakyVar.b, b, parse, b2, str4, parse2, i, str, i2, z, str2, i4).A();
                            }
                        } catch (Exception unused) {
                            baky bakyVar2 = ceqtVar.h;
                            ceqv ceqvVar4 = ceqvVar2;
                            MessageIdType b4 = bdhb.b(ceqvVar4.c);
                            ConversationIdType b5 = bdgq.b(ceqvVar4.d);
                            String str5 = ceqvVar4.e;
                            int i5 = ceqvVar4.l;
                            int i6 = ceqvVar4.i;
                            String str6 = ceqvVar4.g;
                            str5.getClass();
                            str6.getClass();
                            new ProcessDownloadedMmsAction(bakyVar2.e, bakyVar2.b, b4, b5, str5, i5, i6, str6).A();
                            return ceyt.i();
                        }
                    }
                } catch (Exception unused2) {
                    ceqvVar2 = ceqvVar3;
                }
                return ceyt.i();
            }
        }, this.i);
    }
}
