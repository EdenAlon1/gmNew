package defpackage;

import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.learning.internal.ExampleStoreQueryCallbackImpl;
import com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2;
import com.google.android.gms.learning.internal.IExampleStoreV2;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgtw extends IExampleStoreV2.Stub {
    final /* synthetic */ dgty a;

    public dgtw(dgty dgtyVar) {
        this.a = dgtyVar;
    }

    @Override // com.google.android.gms.learning.internal.IExampleStoreV2
    public final void startQuery(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IExampleStoreQueryCallbackV2 iExampleStoreQueryCallbackV2) {
        this.a.b(str, (byte[]) ObjectWrapper.unwrap(iObjectWrapper), (byte[]) ObjectWrapper.unwrap(iObjectWrapper2), new ExampleStoreQueryCallbackImpl(iExampleStoreQueryCallbackV2), ewdr.a);
    }

    @Override // com.google.android.gms.learning.internal.IExampleStoreV2
    public final void startQueryWithSelectorContext(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IExampleStoreQueryCallbackV2 iExampleStoreQueryCallbackV2, IObjectWrapper iObjectWrapper3) {
        ewdr ewdrVar = ewdr.a;
        byte[] bArr = (byte[]) ObjectWrapper.unwrap(iObjectWrapper3);
        if (bArr != null) {
            try {
                ewdrVar = (ewdr) eyfy.parseFrom(ewdr.a, bArr, eyfc.a());
            } catch (eygu e) {
                new ExampleStoreQueryCallbackImpl(iExampleStoreQueryCallbackV2).a(8, e.getMessage());
                return;
            }
        }
        this.a.b(str, (byte[]) ObjectWrapper.unwrap(iObjectWrapper), (byte[]) ObjectWrapper.unwrap(iObjectWrapper2), new ExampleStoreQueryCallbackImpl(iExampleStoreQueryCallbackV2), ewdrVar);
    }

    @Override // com.google.android.gms.learning.internal.IExampleStoreV2
    public final boolean supportsSelectorContext() {
        return true;
    }
}
