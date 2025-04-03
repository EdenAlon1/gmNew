package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctbt {
    public static final ctbx a(List list) {
        list.getClass();
        return list.size() == 1 ? (ctbx) list.get(0) : new ctbu(list);
    }

    public static final ctbx b(ctbx... ctbxVarArr) {
        return ctbxVarArr.length == 1 ? ctbxVarArr[0] : new ctbu(ffdo.c(ctbxVarArr));
    }
}
