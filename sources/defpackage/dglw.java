package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dglw implements dglp {
    public static final dgmt a = new dgmt("InternalGmsDCC");
    public final Executor b;
    public final dgmf c;
    public final dgms d;

    public dglw(dglm dglmVar, Context context, Executor executor, dgmf dgmfVar, dlpw dlpwVar) {
        dgms dgmsVar = new dgms(executor, new dgmd(dgmfVar, executor), dglmVar, new dgmy(context, dlpwVar));
        this.b = executor;
        this.c = dgmfVar;
        this.d = dgmsVar;
    }
}
