package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ekop<T> extends ekoo<T> {
    protected ekop(Class cls) {
        super(cls);
    }

    @Override // defpackage.ekoo
    protected final ListenableFuture d(Context context, Class cls) {
        try {
            return erqt.i(ekhw.a(context, cls));
        } catch (IllegalStateException e) {
            return erqt.h(new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e));
        }
    }
}
