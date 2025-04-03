package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rhq {
    private final List a = new ArrayList();

    public final synchronized List a() {
        return this.a;
    }

    public final synchronized void b(ImageHeaderParser imageHeaderParser) {
        this.a.add(imageHeaderParser);
    }
}
