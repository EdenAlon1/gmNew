package defpackage;

import com.google.android.gms.auth.folsom.SharedKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbfq implements ffji {
    public static final dbfq a = new dbfq();

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SharedKey sharedKey = (SharedKey) obj;
        sharedKey.getClass();
        return "Version: " + sharedKey.a + "\nKeyMaterial: " + Arrays.toString(sharedKey.b) + "\n\n";
    }
}
