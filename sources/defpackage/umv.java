package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class umv extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ffgu c;
    final /* synthetic */ umw d;
    final /* synthetic */ Uri e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public umv(ffgu ffguVar, umw umwVar, Uri uri, ffgu ffguVar2) {
        super(2, ffguVar2);
        this.c = ffguVar;
        this.d = umwVar;
        this.e = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((umv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffgu ffguVar;
        ffgu ffguVar2;
        ffhh ffhhVar = ffhh.a;
        int i = this.b;
        if (i == 0) {
            ffci.b(obj);
            if (((Boolean) dbzi.a.e()).booleanValue()) {
                ffgu ffguVar3 = this.c;
                umw umwVar = this.d;
                Uri uri = this.e;
                this.a = ffguVar3;
                this.b = 1;
                ffhg ffhgVar = new ffhg(ffhi.c(this));
                Resources resources = umwVar.e.getResources();
                CharSequence[] charSequenceArr = {resources.getText(R.string.shareDialogTypeFile), resources.getText(R.string.shareDialogTypeText)};
                ehft ehftVar = new ehft(umwVar.a);
                ehftVar.y(resources.getText(R.string.shareDialogTitle));
                ehftVar.r(new uml(ffhgVar));
                ehftVar.l(charSequenceArr, new umn(umwVar, uri, ffhgVar));
                ehftVar.create().show();
                Object a = ffhgVar.a();
                if (a != ffhhVar) {
                    ffguVar2 = ffguVar3;
                    obj = a;
                    ffguVar2.w(obj);
                }
            } else {
                ffgu ffguVar4 = this.c;
                umw umwVar2 = this.d;
                Uri uri2 = this.e;
                this.a = ffguVar4;
                this.b = 2;
                Object b = umwVar2.b(uri2, this);
                if (b != ffhhVar) {
                    ffguVar = ffguVar4;
                    obj = b;
                    ffguVar.w(obj);
                }
            }
            return ffhhVar;
        }
        if (i != 1) {
            Object obj2 = this.a;
            ffci.b(obj);
            ffguVar = obj2;
            ffguVar.w(obj);
        } else {
            Object obj3 = this.a;
            ffci.b(obj);
            ffguVar2 = obj3;
            ffguVar2.w(obj);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new umv(this.c, this.d, this.e, ffguVar);
    }
}
