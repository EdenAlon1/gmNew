package defpackage;

import android.content.ContentProvider;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cbfy<T extends ContentProvider> extends ContentProvider {
    private Class<T> clazz;
    private Context context;
    private ProviderInfo providerInfo;
    private final emyl<T> supplierInnerContentProvider = emys.a(new emyl() { // from class: cbfx
        @Override // defpackage.emyl
        public final Object get() {
            ContentProvider lambda$new$0;
            lambda$new$0 = cbfy.this.lambda$new$0();
            return lambda$new$0;
        }
    });

    protected cbfy(Class<T> cls) {
        this.clazz = cls;
    }

    private static void attachInfoBypassNullness(ContentProvider contentProvider, Context context, ProviderInfo providerInfo) {
        contentProvider.attachInfo(context, providerInfo);
    }

    private boolean haveAllocatedInnerContentProvider() {
        return this.clazz == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ContentProvider lambda$new$0() {
        try {
            Class<T> cls = this.clazz;
            cls.getClass();
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            T newInstance = declaredConstructor.newInstance(new Object[0]);
            attachInfoBypassNullness(newInstance, this.context, this.providerInfo);
            this.clazz = null;
            this.context = null;
            this.providerInfo = null;
            return newInstance;
        } catch (ReflectiveOperationException e) {
            throw new AssertionError("Unhandled exception", e);
        }
    }

    @Override // android.content.ContentProvider
    public ContentProviderResult[] applyBatch(String str, ArrayList<ContentProviderOperation> arrayList) {
        ContentProviderResult[] applyBatch;
        applyBatch = this.supplierInnerContentProvider.get().applyBatch(str, arrayList);
        return applyBatch;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        this.context = context;
        this.providerInfo = providerInfo;
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        return this.supplierInnerContentProvider.get().bulkInsert(uri, contentValuesArr);
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        return this.supplierInnerContentProvider.get().call(str, str2, bundle);
    }

    @Override // android.content.ContentProvider
    public Uri canonicalize(Uri uri) {
        return this.supplierInnerContentProvider.get().canonicalize(uri);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, Bundle bundle) {
        int delete;
        delete = this.supplierInnerContentProvider.get().delete(uri, bundle);
        return delete;
    }

    @Override // android.content.ContentProvider
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.supplierInnerContentProvider.get().dump(fileDescriptor, printWriter, strArr);
    }

    public T getInnerProvider() {
        return this.supplierInnerContentProvider.get();
    }

    @Override // android.content.ContentProvider
    public String[] getStreamTypes(Uri uri, String str) {
        return this.supplierInnerContentProvider.get().getStreamTypes(uri, str);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return this.supplierInnerContentProvider.get().getType(uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return this.supplierInnerContentProvider.get().insert(uri, contentValues);
    }

    @Override // android.content.ContentProvider
    public void onCallingPackageChanged() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.supplierInnerContentProvider.get().onCallingPackageChanged();
        }
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (haveAllocatedInnerContentProvider()) {
            this.supplierInnerContentProvider.get().onConfigurationChanged(configuration);
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks
    public void onLowMemory() {
        if (haveAllocatedInnerContentProvider()) {
            this.supplierInnerContentProvider.get().onLowMemory();
        }
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (haveAllocatedInnerContentProvider()) {
            this.supplierInnerContentProvider.get().onTrimMemory(i);
        }
    }

    @Override // android.content.ContentProvider
    public AssetFileDescriptor openAssetFile(Uri uri, String str) {
        return this.supplierInnerContentProvider.get().openAssetFile(uri, str);
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return this.supplierInnerContentProvider.get().openFile(uri, str);
    }

    @Override // android.content.ContentProvider
    public <T2> ParcelFileDescriptor openPipeHelper(Uri uri, String str, Bundle bundle, T2 t2, ContentProvider.PipeDataWriter<T2> pipeDataWriter) {
        return this.supplierInnerContentProvider.get().openPipeHelper(uri, str, bundle, t2, pipeDataWriter);
    }

    @Override // android.content.ContentProvider
    public AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle) {
        return this.supplierInnerContentProvider.get().openTypedAssetFile(uri, str, bundle);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        Cursor query;
        try {
            query = this.supplierInnerContentProvider.get().query(uri, strArr, bundle, cancellationSignal);
            return query;
        } catch (NoSuchMethodError unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public boolean refresh(Uri uri, Bundle bundle, CancellationSignal cancellationSignal) {
        boolean refresh;
        refresh = this.supplierInnerContentProvider.get().refresh(uri, bundle, cancellationSignal);
        return refresh;
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        this.supplierInnerContentProvider.get().shutdown();
    }

    @Override // android.content.ContentProvider
    public Uri uncanonicalize(Uri uri) {
        return this.supplierInnerContentProvider.get().uncanonicalize(uri);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, Bundle bundle) {
        int update;
        update = this.supplierInnerContentProvider.get().update(uri, contentValues, bundle);
        return update;
    }

    @Override // android.content.ContentProvider
    public ContentProviderResult[] applyBatch(ArrayList<ContentProviderOperation> arrayList) {
        return this.supplierInnerContentProvider.get().applyBatch(arrayList);
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, String str3, Bundle bundle) {
        Bundle call;
        call = this.supplierInnerContentProvider.get().call(str, str2, str3, bundle);
        return call;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.supplierInnerContentProvider.get().delete(uri, str, strArr);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues, Bundle bundle) {
        Uri insert;
        insert = this.supplierInnerContentProvider.get().insert(uri, contentValues, bundle);
        return insert;
    }

    @Override // android.content.ContentProvider
    public AssetFileDescriptor openAssetFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        return this.supplierInnerContentProvider.get().openAssetFile(uri, str, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        return this.supplierInnerContentProvider.get().openFile(uri, str, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle, CancellationSignal cancellationSignal) {
        return this.supplierInnerContentProvider.get().openTypedAssetFile(uri, str, bundle, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.supplierInnerContentProvider.get().update(uri, contentValues, str, strArr);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.supplierInnerContentProvider.get().query(uri, strArr, str, strArr2, str2);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        return this.supplierInnerContentProvider.get().query(uri, strArr, str, strArr2, str2, cancellationSignal);
    }
}
