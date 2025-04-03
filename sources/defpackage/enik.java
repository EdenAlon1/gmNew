package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enik {
    public final List a = new ArrayList();

    public final void a(enop enopVar) {
        emxf.f(!enopVar.h(), "range must not be empty, but was %s", enopVar);
        this.a.add(enopVar);
    }
}
