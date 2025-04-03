package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.util.DesugarDate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aosg implements aozg {
    public final Context a;
    public final csrv b;
    public final bcsq c;
    public final coxk d;
    public final bigl e;
    public final bdnf f;
    public final ctwb g;
    public final ffbr h;
    public final culq i;
    public final asnv j;
    public final atky k;
    public final String l;
    private final ffsk m;

    public aosg(Context context, ffsk ffskVar, csrv csrvVar, bcsq bcsqVar, coxk coxkVar, bigl biglVar, bdnf bdnfVar, ctwb ctwbVar, ffbr ffbrVar, culq culqVar, asnv asnvVar, atky atkyVar) {
        context.getClass();
        ffskVar.getClass();
        csrvVar.getClass();
        bcsqVar.getClass();
        coxkVar.getClass();
        biglVar.getClass();
        bdnfVar.getClass();
        ctwbVar.getClass();
        ffbrVar.getClass();
        asnvVar.getClass();
        atkyVar.getClass();
        this.a = context;
        this.m = ffskVar;
        this.b = csrvVar;
        this.c = bcsqVar;
        this.d = coxkVar;
        this.e = biglVar;
        this.f = bdnfVar;
        this.g = ctwbVar;
        this.h = ffbrVar;
        this.i = culqVar;
        this.j = asnvVar;
        this.k = atkyVar;
        String string = context.getString(R.string.unknown);
        string.getClass();
        this.l = string;
    }

    public static final MessageIdType d(MessageId messageId) {
        if (!(messageId instanceof apah)) {
            throw new IllegalStateException("Unsupported message id type.");
        }
        MessageIdType c = ((apah) messageId).c();
        c.getClass();
        return c;
    }

    public static final String e(aork aorkVar, boolean z) {
        engw engwVar = aorkVar.e;
        if (engwVar.size() == 1) {
            if (!z) {
                return ((ResolvedRecipient) engwVar.get(0)).g().H(true).toString();
            }
            String n = ((ResolvedRecipient) engwVar.get(0)).g().n();
            return n != null ? n : ((ResolvedRecipient) engwVar.get(0)).g().H(true).toString();
        }
        StringBuilder sb = new StringBuilder("[");
        enqv it = engwVar.iterator();
        it.getClass();
        while (it.hasNext()) {
            ResolvedRecipient resolvedRecipient = (ResolvedRecipient) it.next();
            sb.append(" ");
            if (z) {
                sb.append(resolvedRecipient.g().n());
            } else {
                sb.append(resolvedRecipient.g().H(true));
            }
        }
        sb.append(" ]");
        return sb.toString();
    }

    @Override // defpackage.aozg
    public final elfl a(alxr alxrVar) {
        elfl c;
        c = axol.c(this.m, ffhe.a, ffsm.a, new aose(this, alxrVar, null));
        return c;
    }

    public final engw b(enhk enhkVar, long[] jArr, long[] jArr2) {
        if (jArr2 == null) {
            int i = engw.d;
            engw engwVar = enou.a;
            engwVar.getClass();
            return engwVar;
        }
        ArrayList arrayList = new ArrayList(jArr2.length);
        int i2 = 0;
        int i3 = 0;
        while (i2 < jArr2.length) {
            long j = jArr2[i2];
            int i4 = i3 + 1;
            ResolvedRecipient resolvedRecipient = (ResolvedRecipient) enhkVar.get(Long.valueOf(jArr[i3]));
            aosd aosdVar = null;
            if (resolvedRecipient != null && j > 0) {
                Instant ofEpochMilli = Instant.ofEpochMilli(j);
                ofEpochMilli.getClass();
                aosdVar = new aosd(this, resolvedRecipient, ofEpochMilli);
            }
            arrayList.add(aosdVar);
            i2++;
            i3 = i4;
        }
        return engq.a(ffdx.ah(ffdx.aa(arrayList), new aosf()));
    }

    public final String c(Instant instant) {
        String format = new SimpleDateFormat("MM/d/yy h:mm a", ctid.c(this.a)).format(DesugarDate.from(instant.atZone(ZoneId.systemDefault()).L().q(ZoneId.systemDefault()).truncatedTo(ChronoUnit.MINUTES).toInstant()));
        format.getClass();
        return format;
    }
}
