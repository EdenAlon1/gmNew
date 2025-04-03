package defpackage;

import android.content.Context;
import java.io.File;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbjx {
    public final String a = "com.google.android.apps.messaging.shared.datamodel.richcard.RichCardMediaFileProvider";
    public final String b = "richcard-";
    private final Function c;

    public cbjx(Function function) {
        this.c = function;
    }

    public final File a(Context context, String str) {
        Object apply;
        apply = this.c.apply(context);
        return new File((File) apply, str);
    }
}
