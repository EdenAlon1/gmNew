package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class bbeq implements bbck {
    public abstract Action a(Optional optional, List list, boolean z, String str, axad axadVar);

    public final bbcd b(List list, Object obj, bbeo bbeoVar, Optional optional) {
        Action a = a(optional, list, false, null, null);
        bbcc bbccVar = new bbcc(new bbep(bbeoVar), a, obj);
        a.F(bbccVar);
        return bbccVar;
    }
}
