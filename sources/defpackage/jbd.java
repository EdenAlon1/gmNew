package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbd extends ffkk implements ffji {
    final /* synthetic */ hho a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbd(hho hhoVar) {
        super(1);
        this.a = hhoVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Configuration configuration = new Configuration((Configuration) obj);
        hik hikVar = AndroidCompositionLocals_androidKt.a;
        this.a.b(configuration);
        return ffcu.a;
    }
}
