package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dawn extends ffhv implements ffjm {
    final /* synthetic */ File a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dawn(ffgu ffguVar, File file, int i, int i2) {
        super(2, ffguVar);
        this.a = file;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dawn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ffdx.B(ffno.g(ffno.k(ffno.h(ffip.a(new BufferedReader(new InputStreamReader(new FileInputStream(this.a), ffoo.a), 8192)), this.b), this.c)));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dawn dawnVar = new dawn(ffguVar, this.a, this.b, this.c);
        dawnVar.d = obj;
        return dawnVar;
    }
}
