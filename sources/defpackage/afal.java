package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afal {
    public static final cskc a = cskc.g("BugleSuperSort", "LabelDataServiceImpl");
    public final Context b;
    public final ejvb c;
    public final errl d;
    public final ffbr e;
    public final afar f;

    public afal(Context context, ejvb ejvbVar, errl errlVar, ffbr ffbrVar, afar afarVar) {
        this.b = context;
        this.c = ejvbVar;
        this.d = errlVar;
        this.e = ffbrVar;
        this.f = afarVar;
        new AtomicReference(SuperSortLabel.UNKNOWN);
    }
}
