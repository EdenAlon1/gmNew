package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rpn extends rpo {
    public final ArrayList a;

    public rpn(Context context) {
        super(context);
        this.a = new ArrayList(2);
    }

    public final void a(rpl rplVar, rps rpsVar) {
        this.a.add(new rpm(rplVar, rpsVar));
    }
}
