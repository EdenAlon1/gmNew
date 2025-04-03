package defpackage;

import android.net.Uri;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sms implements smn {
    public final smf a;
    public final elbx b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffsk f;
    private final abln g;

    public sms(smf smfVar, elbx elbxVar, ffbr ffbrVar, abln ablnVar, ffbr ffbrVar2, ffbr ffbrVar3, ffsk ffskVar) {
        elbxVar.getClass();
        ffbrVar.getClass();
        ffbrVar3.getClass();
        ffskVar.getClass();
        this.a = smfVar;
        this.b = elbxVar;
        this.c = ffbrVar;
        this.g = ablnVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffskVar;
    }

    @Override // defpackage.smn
    public final void a(crly crlyVar, MessageIdType messageIdType, String str, Uri uri, VmtTable.BindData bindData, smu smuVar, String str2) {
        doui dougVar;
        String n;
        crlyVar.getClass();
        messageIdType.getClass();
        str.getClass();
        uri.getClass();
        crlyVar.f(R.layout.transcription_view);
        List a = (str2 == null || str2.length() == 0) ? ffel.a : (bindData == null || (n = bindData.n()) == null) ? ffel.a : this.g.a(str2, n, false);
        if (!a.isEmpty()) {
            ((akzt) this.c.b()).c("Bugle.Vmt.TranscriptConversationSearchMatch.Count");
        }
        Boolean bool = (Boolean) smuVar.a.get(str);
        boolean z = (bool != null && bool.booleanValue()) || !a.isEmpty();
        sme smeVar = new sme(z);
        smr smrVar = new smr(smuVar, str, smeVar, this, crlyVar, messageIdType, uri);
        doui douiVar = null;
        if (bindData != null) {
            ardn k = bindData.k();
            if (k != null) {
                int ordinal = k.ordinal();
                if (ordinal == 2) {
                    dougVar = new doug(null);
                } else if (ordinal == 3) {
                    String n2 = bindData.n();
                    if (n2 != null) {
                        douiVar = new douf(n2, z, a);
                    }
                } else if (ordinal == 5) {
                    dougVar = new douh(null);
                }
                douiVar = dougVar;
            }
        } else if (smm.b()) {
            dougVar = new douh(null);
            douiVar = dougVar;
        }
        if (douiVar != null) {
            ((ComposeView) crlyVar.b()).a(new hpw(2030961349, true, new smp(douiVar, smeVar, this, uri, smrVar)));
        }
    }
}
