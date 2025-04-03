package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceos {
    public final AtomicReference a;
    private final ceor b;

    public ceos(Context context, elbx elbxVar) {
        elbxVar.getClass();
        ceor ceorVar = new ceor(this, elbxVar);
        this.b = ceorVar;
        this.a = new AtomicReference();
        context.getContentResolver().registerContentObserver(Uri.parse(bcqc.o(context)), false, ceorVar);
        context.getContentResolver().registerContentObserver(Uri.parse(bcqc.o(context).concat("participants")), true, ceorVar);
        context.getContentResolver().registerContentObserver(bcqc.m(context), true, ceorVar);
        context.getContentResolver().registerContentObserver(bcqc.j(context), false, ceorVar);
    }
}
