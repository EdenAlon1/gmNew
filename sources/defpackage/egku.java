package defpackage;

import android.os.Bundle;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egku {
    public static final ea a(ewiw ewiwVar) {
        Bundle bundle = new Bundle();
        ProtoParsers.k(bundle, "clusterKey", ewiwVar);
        egkt egktVar = new egkt();
        egktVar.at(bundle);
        return egktVar;
    }
}
