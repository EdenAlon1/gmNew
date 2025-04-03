package defpackage;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eksa extends eewk {
    final /* synthetic */ eksb a;
    private final SimpleDateFormat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eksa(eksb eksbVar) {
        super("dumpInfo");
        this.a = eksbVar;
        this.b = new SimpleDateFormat("HH:mm:ss yyyy.MM.dd z", Locale.US);
    }

    @Override // defpackage.eewl
    public final String c(Context context, String[] strArr) {
        StringBuilder sb = new StringBuilder("Synclets:\n");
        for (Map.Entry entry : this.a.a(strArr).entrySet()) {
            ektu ektuVar = (ektu) entry.getKey();
            long longValue = ((Long) entry.getValue()).longValue();
            eisx eisxVar = ektuVar.c;
            sb.append("  Synclet:\n    Key: ");
            sb.append(ektuVar.b.b());
            sb.append("\n    Account: ");
            sb.append(eisxVar == null ? "null" : Integer.valueOf(((eisz) eisxVar).a));
            sb.append("\n    Last sync: ");
            sb.append(this.b.format(new Date(longValue)));
            sb.append('\n');
        }
        return sb.toString();
    }

    @Override // defpackage.eewk, defpackage.eewl
    public final String[] d(Context context, String[] strArr) {
        return this.a.b(strArr);
    }
}
