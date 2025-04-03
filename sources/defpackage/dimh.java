package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dimh extends ArrayList {
    private static final long serialVersionUID = -2638269606726558526L;
    public dimb a;

    public dimh(dimb dimbVar) {
        dimbVar.getClass();
        this.a = dimbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional a(String str, ctvb ctvbVar) {
        String k = dkut.k(str, ctvbVar);
        int size = size();
        for (int i = 0; i < size; i++) {
            dimg dimgVar = (dimg) get(i);
            String str2 = dimgVar.g;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(k) && str2.contains(k)) {
                return Optional.of(dimgVar);
            }
        }
        return Optional.empty();
    }

    public final boolean b() {
        if (this.a != dimb.NONE) {
            return true;
        }
        dkty.q("Invalid user list. State is NONE.", new Object[0]);
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dimh)) {
            return false;
        }
        dimh dimhVar = (dimh) obj;
        if (this.a == dimhVar.a) {
            return super.equals(dimhVar);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "State: " + String.valueOf(this.a) + ", Elements: " + Arrays.toString(toArray());
    }
}
