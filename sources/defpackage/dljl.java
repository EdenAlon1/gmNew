package defpackage;

import com.google.android.libraries.abuse.hades.tartarus.runtime.Data;
import com.google.android.libraries.abuse.hades.tartarus.runtime.TartarusKt;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dljl implements ffji {
    public final dlkw a;
    private final dlkz b;

    public dljl(dlkw dlkwVar, dlkz dlkzVar) {
        this.a = dlkwVar;
        this.b = dlkzVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Data data = (Data) obj;
        data.getClass();
        int i = dlkx.a;
        Data data2 = new Data();
        ByteBuffer byteBuffer = this.a.a;
        dlkz dlkzVar = this.b;
        TartarusKt.runScarBlobs(byteBuffer, 1, dlkzVar.a, dlkzVar.b, dlkzVar.c, dlkzVar.d, data, data2);
        return data2;
    }
}
