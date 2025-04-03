package defpackage;

import android.content.Context;
import com.google.research.xeno.effect.AssetDownloader;
import com.google.research.xeno.effect.RemoteAssetManager;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtls extends ffhv implements ffjm {
    final /* synthetic */ dtma a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtls(dtma dtmaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dtmaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtls) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        String str;
        AssetDownloader assetDownloader;
        engw engwVar;
        RemoteAssetManager remoteAssetManager;
        ffci.b(obj);
        facp facpVar = new facp();
        facpVar.a(-1L);
        int i = engw.d;
        engw engwVar2 = enou.a;
        if (engwVar2 == null) {
            throw new NullPointerException("Null oldRemoteAssetCachePaths");
        }
        dtma dtmaVar = this.a;
        facpVar.d = engwVar2;
        Context context = dtmaVar.a;
        File file = new File(context.getFilesDir(), "asset_cache");
        file.mkdir();
        if (!file.isDirectory()) {
            file.toString();
            throw new IOException("Unable to create asset cache directory: ".concat(file.toString()));
        }
        dtlk dtlkVar = dtmaVar.c;
        String path = file.getPath();
        path.getClass();
        facpVar.a = path;
        facpVar.a(dtlkVar.b.getSeconds());
        facpVar.c = new fadx();
        if (facpVar.e != 1 || (str = facpVar.a) == null || (assetDownloader = facpVar.c) == null || (engwVar = facpVar.d) == null) {
            StringBuilder sb = new StringBuilder();
            if (facpVar.a == null) {
                sb.append(" remoteAssetCacheBasePath");
            }
            if (facpVar.e == 0) {
                sb.append(" remoteAssetCacheTtlDurationSeconds");
            }
            if (facpVar.c == null) {
                sb.append(" assetDownloader");
            }
            if (facpVar.d == null) {
                sb.append(" oldRemoteAssetCachePaths");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        facq facqVar = new facq(str, facpVar.b, assetDownloader, engwVar);
        Map map = RemoteAssetManager.a;
        synchronized (RemoteAssetManager.class) {
            String str2 = facqVar.a;
            remoteAssetManager = (RemoteAssetManager) RemoteAssetManager.a.get(str2);
            if (remoteAssetManager == null) {
                remoteAssetManager = new RemoteAssetManager(context, facqVar);
                if (remoteAssetManager.c != null) {
                    RemoteAssetManager.a.put(str2, remoteAssetManager);
                }
            }
        }
        return new dtlr(remoteAssetManager);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dtls(this.a, ffguVar);
    }
}
