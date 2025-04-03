package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acft extends acfm {
    private final Context g;
    private final ctwb h;

    public acft(acfk acfkVar, Context context, ctwb ctwbVar) {
        super(acfkVar, "SIM Card Present");
        this.g = context;
        this.h = ctwbVar;
    }

    @Override // defpackage.acfm
    public final acfn a() {
        return this.h.r() ? acfn.a : new acfn(5, Collections.singletonList(this.g.getString(R.string.insert_sim_suggestion)));
    }
}
