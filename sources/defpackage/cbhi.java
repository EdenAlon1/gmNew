package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbhi extends ContentProvider {
    private static final cskc a = cskc.g("Bugle", "SharedStorageProvider");

    /* compiled from: PG */
    public interface a {
        cbhg bJ();

        ekww eD();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(12:6|7|8|(1:10)(2:44|(1:46)(2:47|(1:49)(5:50|(1:52)(3:451|8b|(1:460))|53|54|(2:56|(5:58|(3:62|63|(1:(1:(1:67)(2:68|(1:70)(2:71|(1:73)(1:74))))(2:(3:79|80|(1:(1:(1:(1:88)(2:89|(3:(2:94|(1:(1:97)(1:98))(1:99))|100|(0)(0))(4:101|(2:103|(0)(0))|100|(0)(0))))(2:104|(3:(2:109|(1:(1:112)(3:113|(1:115)(1:117)|116))(1:118))|119|(0)(0))(4:120|(2:122|(0)(0))|119|(0)(0))))(3:123|124|(1:(3:(2:130|(1:(1:(1:134)(6:135|136|137|(1:139)(1:143)|140|141))(7:145|(4:147|148|149|150)(2:153|(4:155|156|157|150)(2:160|(5:162|163|164|165|150)(2:168|(3:226|227|150)(5:170|(4:175|176|(1:(1:(1:(2:184|(1:(1:187)(2:188|189))(2:192|193))(2:196|197))(2:200|201))(1:204))(1:205)|150)|222|223|150))))|465|466|467|468|470))(1:230))|231|(0)(0))(4:232|(2:234|(0)(0))|231|(0)(0)))(4:235|(2:237|(0)(0))|231|(0)(0))))(2:238|(3:(2:243|(1:(1:246)(3:247|(1:249)(1:251)|250))(1:252))|253|(0)(0))(4:254|(2:256|(0)(0))|253|(0)(0))))|267))(1:(1:269)(3:270|271|(1:(1:(1:(1:279)(2:280|(3:(2:285|(1:(1:288)(1:289))(1:290))|291|(0)(0))(4:292|(2:294|(0)(0))|291|(0)(0))))(2:295|(3:(2:300|(1:(1:303)(3:304|(1:306)(1:308)|307))(1:309))|310|(0)(0))(4:311|(2:313|(0)(0))|310|(0)(0))))(4:314|315|(1:(1:(1:(1:323)(2:325|(1:327)(1:328)))(2:329|(1:331)(1:332)))(2:333|(1:335)(3:336|(2:341|(1:343)(2:344|(1:346)(2:347|(1:349)(3:350|351|(1:(1:(1:(1:359)(1:360))(1:361))(1:362))(1:363)))))|374)))(1:375)|324))(3:386|387|(2:392|(1:(1:(2:396|(2:398|399)(3:400|(1:402)(1:404)|403))(2:405|(1:407)(2:408|(1:410)(1:411))))(2:412|(1:414)(1:415)))(2:416|(1:418)(1:419)))(1:420)))))|444|63|(0)(0))(5:445|(3:447|63|(0)(0))|444|63|(0)(0)))(5:448|(3:450|63|(0)(0))|444|63|(0)(0)))))|11|(6:31|(1:33)(1:42)|34|35|19|20)(1:13)|14|(5:16|17|18|19|20)|23|24|19|20) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:170|(4:175|176|(1:(1:(1:(2:184|(1:(1:187)(2:188|189))(2:192|193))(2:196|197))(2:200|201))(1:204))(1:205)|150)|222|223|150) */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x05c5, code lost:
    
        r0 = defpackage.elfo.d(new java.lang.IllegalArgumentException("Invalid ProvisioningSuccessData proto"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0b56, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0b59, code lost:
    
        if ((r0 instanceof java.lang.InterruptedException) != false) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0b5b, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0b62, code lost:
    
        defpackage.cbhi.a.s("Call to Future inside SharedStorageProvider BinderThread failed: ", r0);
        r0 = new android.os.Bundle();
        r0.putInt("result_error_key", 7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0b15, code lost:
    
        if (r1.startsWith("AsyncTask #") == false) goto L449;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x029c A[Catch: all -> 0x0b7b, TryCatch #17 {all -> 0x0b7b, blocks: (B:8:0x0033, B:10:0x003f, B:11:0x0aee, B:14:0x0b3f, B:17:0x0b45, B:24:0x0b4d, B:27:0x0b57, B:29:0x0b5b, B:30:0x0b62, B:31:0x0b06, B:35:0x0b17, B:38:0x0b21, B:40:0x0b25, B:41:0x0b2c, B:42:0x0b0f, B:44:0x004c, B:46:0x005e, B:47:0x0064, B:49:0x006b, B:50:0x0071, B:53:0x00b9, B:67:0x00fd, B:68:0x0116, B:70:0x011e, B:71:0x0134, B:73:0x013c, B:74:0x0167, B:76:0x016f, B:79:0x0179, B:88:0x01b2, B:89:0x01cb, B:97:0x01f3, B:98:0x01f9, B:99:0x0219, B:104:0x022f, B:112:0x0257, B:113:0x025d, B:115:0x026d, B:116:0x028f, B:117:0x0284, B:118:0x029c, B:123:0x02b2, B:134:0x02ed, B:135:0x02f3, B:137:0x02fb, B:139:0x0303, B:141:0x034c, B:143:0x0322, B:144:0x0341, B:145:0x0359, B:147:0x0369, B:149:0x0371, B:150:0x05d0, B:152:0x037f, B:153:0x038c, B:155:0x0394, B:157:0x039c, B:159:0x03aa, B:160:0x03b7, B:162:0x03bf, B:164:0x03ea, B:165:0x03f2, B:167:0x0425, B:168:0x0432, B:227:0x043a, B:170:0x0455, B:172:0x045d, B:175:0x0467, B:187:0x04b9, B:189:0x04c6, B:191:0x04e6, B:193:0x04f3, B:195:0x0513, B:197:0x0520, B:199:0x0540, B:201:0x054d, B:203:0x056c, B:204:0x0578, B:205:0x058f, B:223:0x05a6, B:225:0x05c5, B:229:0x0448, B:230:0x05dd, B:238:0x05f3, B:246:0x061b, B:247:0x0621, B:249:0x0631, B:250:0x0653, B:251:0x0648, B:252:0x0660, B:267:0x0676, B:269:0x067e, B:270:0x0684, B:279:0x06bd, B:280:0x06d6, B:288:0x06fe, B:289:0x0704, B:290:0x0724, B:295:0x0740, B:303:0x0768, B:304:0x076e, B:306:0x077e, B:307:0x0799, B:308:0x078e, B:309:0x07a6, B:314:0x07c2, B:323:0x0801, B:324:0x09b5, B:325:0x080e, B:327:0x081e, B:328:0x0831, B:329:0x085a, B:331:0x0862, B:332:0x0868, B:333:0x0883, B:335:0x0893, B:336:0x08a4, B:338:0x08ac, B:341:0x08b6, B:343:0x08be, B:344:0x08cf, B:346:0x08d7, B:347:0x08e8, B:349:0x08f0, B:350:0x0910, B:359:0x0949, B:360:0x0955, B:361:0x0965, B:362:0x0975, B:363:0x0985, B:374:0x0995, B:375:0x09a5, B:386:0x09c2, B:399:0x0a12, B:400:0x0a18, B:402:0x0a28, B:403:0x0a43, B:404:0x0a38, B:405:0x0a50, B:407:0x0a58, B:408:0x0a68, B:410:0x0a70, B:411:0x0a7f, B:412:0x0a84, B:414:0x0a8c, B:415:0x0aa7, B:416:0x0aac, B:418:0x0ab4, B:419:0x0acf, B:420:0x0ad4, B:451:0x0089, B:452:0x008b, B:460:0x00a0, B:464:0x0b7a, B:454:0x008c, B:456:0x0090, B:457:0x0093, B:458:0x009d), top: B:7:0x0033, inners: #1, #2, #3, #4, #6, #7, #9, #10, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05dd A[Catch: all -> 0x0b7b, TryCatch #17 {all -> 0x0b7b, blocks: (B:8:0x0033, B:10:0x003f, B:11:0x0aee, B:14:0x0b3f, B:17:0x0b45, B:24:0x0b4d, B:27:0x0b57, B:29:0x0b5b, B:30:0x0b62, B:31:0x0b06, B:35:0x0b17, B:38:0x0b21, B:40:0x0b25, B:41:0x0b2c, B:42:0x0b0f, B:44:0x004c, B:46:0x005e, B:47:0x0064, B:49:0x006b, B:50:0x0071, B:53:0x00b9, B:67:0x00fd, B:68:0x0116, B:70:0x011e, B:71:0x0134, B:73:0x013c, B:74:0x0167, B:76:0x016f, B:79:0x0179, B:88:0x01b2, B:89:0x01cb, B:97:0x01f3, B:98:0x01f9, B:99:0x0219, B:104:0x022f, B:112:0x0257, B:113:0x025d, B:115:0x026d, B:116:0x028f, B:117:0x0284, B:118:0x029c, B:123:0x02b2, B:134:0x02ed, B:135:0x02f3, B:137:0x02fb, B:139:0x0303, B:141:0x034c, B:143:0x0322, B:144:0x0341, B:145:0x0359, B:147:0x0369, B:149:0x0371, B:150:0x05d0, B:152:0x037f, B:153:0x038c, B:155:0x0394, B:157:0x039c, B:159:0x03aa, B:160:0x03b7, B:162:0x03bf, B:164:0x03ea, B:165:0x03f2, B:167:0x0425, B:168:0x0432, B:227:0x043a, B:170:0x0455, B:172:0x045d, B:175:0x0467, B:187:0x04b9, B:189:0x04c6, B:191:0x04e6, B:193:0x04f3, B:195:0x0513, B:197:0x0520, B:199:0x0540, B:201:0x054d, B:203:0x056c, B:204:0x0578, B:205:0x058f, B:223:0x05a6, B:225:0x05c5, B:229:0x0448, B:230:0x05dd, B:238:0x05f3, B:246:0x061b, B:247:0x0621, B:249:0x0631, B:250:0x0653, B:251:0x0648, B:252:0x0660, B:267:0x0676, B:269:0x067e, B:270:0x0684, B:279:0x06bd, B:280:0x06d6, B:288:0x06fe, B:289:0x0704, B:290:0x0724, B:295:0x0740, B:303:0x0768, B:304:0x076e, B:306:0x077e, B:307:0x0799, B:308:0x078e, B:309:0x07a6, B:314:0x07c2, B:323:0x0801, B:324:0x09b5, B:325:0x080e, B:327:0x081e, B:328:0x0831, B:329:0x085a, B:331:0x0862, B:332:0x0868, B:333:0x0883, B:335:0x0893, B:336:0x08a4, B:338:0x08ac, B:341:0x08b6, B:343:0x08be, B:344:0x08cf, B:346:0x08d7, B:347:0x08e8, B:349:0x08f0, B:350:0x0910, B:359:0x0949, B:360:0x0955, B:361:0x0965, B:362:0x0975, B:363:0x0985, B:374:0x0995, B:375:0x09a5, B:386:0x09c2, B:399:0x0a12, B:400:0x0a18, B:402:0x0a28, B:403:0x0a43, B:404:0x0a38, B:405:0x0a50, B:407:0x0a58, B:408:0x0a68, B:410:0x0a70, B:411:0x0a7f, B:412:0x0a84, B:414:0x0a8c, B:415:0x0aa7, B:416:0x0aac, B:418:0x0ab4, B:419:0x0acf, B:420:0x0ad4, B:451:0x0089, B:452:0x008b, B:460:0x00a0, B:464:0x0b7a, B:454:0x008c, B:456:0x0090, B:457:0x0093, B:458:0x009d), top: B:7:0x0033, inners: #1, #2, #3, #4, #6, #7, #9, #10, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0660 A[Catch: all -> 0x0b7b, TryCatch #17 {all -> 0x0b7b, blocks: (B:8:0x0033, B:10:0x003f, B:11:0x0aee, B:14:0x0b3f, B:17:0x0b45, B:24:0x0b4d, B:27:0x0b57, B:29:0x0b5b, B:30:0x0b62, B:31:0x0b06, B:35:0x0b17, B:38:0x0b21, B:40:0x0b25, B:41:0x0b2c, B:42:0x0b0f, B:44:0x004c, B:46:0x005e, B:47:0x0064, B:49:0x006b, B:50:0x0071, B:53:0x00b9, B:67:0x00fd, B:68:0x0116, B:70:0x011e, B:71:0x0134, B:73:0x013c, B:74:0x0167, B:76:0x016f, B:79:0x0179, B:88:0x01b2, B:89:0x01cb, B:97:0x01f3, B:98:0x01f9, B:99:0x0219, B:104:0x022f, B:112:0x0257, B:113:0x025d, B:115:0x026d, B:116:0x028f, B:117:0x0284, B:118:0x029c, B:123:0x02b2, B:134:0x02ed, B:135:0x02f3, B:137:0x02fb, B:139:0x0303, B:141:0x034c, B:143:0x0322, B:144:0x0341, B:145:0x0359, B:147:0x0369, B:149:0x0371, B:150:0x05d0, B:152:0x037f, B:153:0x038c, B:155:0x0394, B:157:0x039c, B:159:0x03aa, B:160:0x03b7, B:162:0x03bf, B:164:0x03ea, B:165:0x03f2, B:167:0x0425, B:168:0x0432, B:227:0x043a, B:170:0x0455, B:172:0x045d, B:175:0x0467, B:187:0x04b9, B:189:0x04c6, B:191:0x04e6, B:193:0x04f3, B:195:0x0513, B:197:0x0520, B:199:0x0540, B:201:0x054d, B:203:0x056c, B:204:0x0578, B:205:0x058f, B:223:0x05a6, B:225:0x05c5, B:229:0x0448, B:230:0x05dd, B:238:0x05f3, B:246:0x061b, B:247:0x0621, B:249:0x0631, B:250:0x0653, B:251:0x0648, B:252:0x0660, B:267:0x0676, B:269:0x067e, B:270:0x0684, B:279:0x06bd, B:280:0x06d6, B:288:0x06fe, B:289:0x0704, B:290:0x0724, B:295:0x0740, B:303:0x0768, B:304:0x076e, B:306:0x077e, B:307:0x0799, B:308:0x078e, B:309:0x07a6, B:314:0x07c2, B:323:0x0801, B:324:0x09b5, B:325:0x080e, B:327:0x081e, B:328:0x0831, B:329:0x085a, B:331:0x0862, B:332:0x0868, B:333:0x0883, B:335:0x0893, B:336:0x08a4, B:338:0x08ac, B:341:0x08b6, B:343:0x08be, B:344:0x08cf, B:346:0x08d7, B:347:0x08e8, B:349:0x08f0, B:350:0x0910, B:359:0x0949, B:360:0x0955, B:361:0x0965, B:362:0x0975, B:363:0x0985, B:374:0x0995, B:375:0x09a5, B:386:0x09c2, B:399:0x0a12, B:400:0x0a18, B:402:0x0a28, B:403:0x0a43, B:404:0x0a38, B:405:0x0a50, B:407:0x0a58, B:408:0x0a68, B:410:0x0a70, B:411:0x0a7f, B:412:0x0a84, B:414:0x0a8c, B:415:0x0aa7, B:416:0x0aac, B:418:0x0ab4, B:419:0x0acf, B:420:0x0ad4, B:451:0x0089, B:452:0x008b, B:460:0x00a0, B:464:0x0b7a, B:454:0x008c, B:456:0x0090, B:457:0x0093, B:458:0x009d), top: B:7:0x0033, inners: #1, #2, #3, #4, #6, #7, #9, #10, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0724 A[Catch: all -> 0x0b7b, TryCatch #17 {all -> 0x0b7b, blocks: (B:8:0x0033, B:10:0x003f, B:11:0x0aee, B:14:0x0b3f, B:17:0x0b45, B:24:0x0b4d, B:27:0x0b57, B:29:0x0b5b, B:30:0x0b62, B:31:0x0b06, B:35:0x0b17, B:38:0x0b21, B:40:0x0b25, B:41:0x0b2c, B:42:0x0b0f, B:44:0x004c, B:46:0x005e, B:47:0x0064, B:49:0x006b, B:50:0x0071, B:53:0x00b9, B:67:0x00fd, B:68:0x0116, B:70:0x011e, B:71:0x0134, B:73:0x013c, B:74:0x0167, B:76:0x016f, B:79:0x0179, B:88:0x01b2, B:89:0x01cb, B:97:0x01f3, B:98:0x01f9, B:99:0x0219, B:104:0x022f, B:112:0x0257, B:113:0x025d, B:115:0x026d, B:116:0x028f, B:117:0x0284, B:118:0x029c, B:123:0x02b2, B:134:0x02ed, B:135:0x02f3, B:137:0x02fb, B:139:0x0303, B:141:0x034c, B:143:0x0322, B:144:0x0341, B:145:0x0359, B:147:0x0369, B:149:0x0371, B:150:0x05d0, B:152:0x037f, B:153:0x038c, B:155:0x0394, B:157:0x039c, B:159:0x03aa, B:160:0x03b7, B:162:0x03bf, B:164:0x03ea, B:165:0x03f2, B:167:0x0425, B:168:0x0432, B:227:0x043a, B:170:0x0455, B:172:0x045d, B:175:0x0467, B:187:0x04b9, B:189:0x04c6, B:191:0x04e6, B:193:0x04f3, B:195:0x0513, B:197:0x0520, B:199:0x0540, B:201:0x054d, B:203:0x056c, B:204:0x0578, B:205:0x058f, B:223:0x05a6, B:225:0x05c5, B:229:0x0448, B:230:0x05dd, B:238:0x05f3, B:246:0x061b, B:247:0x0621, B:249:0x0631, B:250:0x0653, B:251:0x0648, B:252:0x0660, B:267:0x0676, B:269:0x067e, B:270:0x0684, B:279:0x06bd, B:280:0x06d6, B:288:0x06fe, B:289:0x0704, B:290:0x0724, B:295:0x0740, B:303:0x0768, B:304:0x076e, B:306:0x077e, B:307:0x0799, B:308:0x078e, B:309:0x07a6, B:314:0x07c2, B:323:0x0801, B:324:0x09b5, B:325:0x080e, B:327:0x081e, B:328:0x0831, B:329:0x085a, B:331:0x0862, B:332:0x0868, B:333:0x0883, B:335:0x0893, B:336:0x08a4, B:338:0x08ac, B:341:0x08b6, B:343:0x08be, B:344:0x08cf, B:346:0x08d7, B:347:0x08e8, B:349:0x08f0, B:350:0x0910, B:359:0x0949, B:360:0x0955, B:361:0x0965, B:362:0x0975, B:363:0x0985, B:374:0x0995, B:375:0x09a5, B:386:0x09c2, B:399:0x0a12, B:400:0x0a18, B:402:0x0a28, B:403:0x0a43, B:404:0x0a38, B:405:0x0a50, B:407:0x0a58, B:408:0x0a68, B:410:0x0a70, B:411:0x0a7f, B:412:0x0a84, B:414:0x0a8c, B:415:0x0aa7, B:416:0x0aac, B:418:0x0ab4, B:419:0x0acf, B:420:0x0ad4, B:451:0x0089, B:452:0x008b, B:460:0x00a0, B:464:0x0b7a, B:454:0x008c, B:456:0x0090, B:457:0x0093, B:458:0x009d), top: B:7:0x0033, inners: #1, #2, #3, #4, #6, #7, #9, #10, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x07a6 A[Catch: all -> 0x0b7b, TryCatch #17 {all -> 0x0b7b, blocks: (B:8:0x0033, B:10:0x003f, B:11:0x0aee, B:14:0x0b3f, B:17:0x0b45, B:24:0x0b4d, B:27:0x0b57, B:29:0x0b5b, B:30:0x0b62, B:31:0x0b06, B:35:0x0b17, B:38:0x0b21, B:40:0x0b25, B:41:0x0b2c, B:42:0x0b0f, B:44:0x004c, B:46:0x005e, B:47:0x0064, B:49:0x006b, B:50:0x0071, B:53:0x00b9, B:67:0x00fd, B:68:0x0116, B:70:0x011e, B:71:0x0134, B:73:0x013c, B:74:0x0167, B:76:0x016f, B:79:0x0179, B:88:0x01b2, B:89:0x01cb, B:97:0x01f3, B:98:0x01f9, B:99:0x0219, B:104:0x022f, B:112:0x0257, B:113:0x025d, B:115:0x026d, B:116:0x028f, B:117:0x0284, B:118:0x029c, B:123:0x02b2, B:134:0x02ed, B:135:0x02f3, B:137:0x02fb, B:139:0x0303, B:141:0x034c, B:143:0x0322, B:144:0x0341, B:145:0x0359, B:147:0x0369, B:149:0x0371, B:150:0x05d0, B:152:0x037f, B:153:0x038c, B:155:0x0394, B:157:0x039c, B:159:0x03aa, B:160:0x03b7, B:162:0x03bf, B:164:0x03ea, B:165:0x03f2, B:167:0x0425, B:168:0x0432, B:227:0x043a, B:170:0x0455, B:172:0x045d, B:175:0x0467, B:187:0x04b9, B:189:0x04c6, B:191:0x04e6, B:193:0x04f3, B:195:0x0513, B:197:0x0520, B:199:0x0540, B:201:0x054d, B:203:0x056c, B:204:0x0578, B:205:0x058f, B:223:0x05a6, B:225:0x05c5, B:229:0x0448, B:230:0x05dd, B:238:0x05f3, B:246:0x061b, B:247:0x0621, B:249:0x0631, B:250:0x0653, B:251:0x0648, B:252:0x0660, B:267:0x0676, B:269:0x067e, B:270:0x0684, B:279:0x06bd, B:280:0x06d6, B:288:0x06fe, B:289:0x0704, B:290:0x0724, B:295:0x0740, B:303:0x0768, B:304:0x076e, B:306:0x077e, B:307:0x0799, B:308:0x078e, B:309:0x07a6, B:314:0x07c2, B:323:0x0801, B:324:0x09b5, B:325:0x080e, B:327:0x081e, B:328:0x0831, B:329:0x085a, B:331:0x0862, B:332:0x0868, B:333:0x0883, B:335:0x0893, B:336:0x08a4, B:338:0x08ac, B:341:0x08b6, B:343:0x08be, B:344:0x08cf, B:346:0x08d7, B:347:0x08e8, B:349:0x08f0, B:350:0x0910, B:359:0x0949, B:360:0x0955, B:361:0x0965, B:362:0x0975, B:363:0x0985, B:374:0x0995, B:375:0x09a5, B:386:0x09c2, B:399:0x0a12, B:400:0x0a18, B:402:0x0a28, B:403:0x0a43, B:404:0x0a38, B:405:0x0a50, B:407:0x0a58, B:408:0x0a68, B:410:0x0a70, B:411:0x0a7f, B:412:0x0a84, B:414:0x0a8c, B:415:0x0aa7, B:416:0x0aac, B:418:0x0ab4, B:419:0x0acf, B:420:0x0ad4, B:451:0x0089, B:452:0x008b, B:460:0x00a0, B:464:0x0b7a, B:454:0x008c, B:456:0x0090, B:457:0x0093, B:458:0x009d), top: B:7:0x0033, inners: #1, #2, #3, #4, #6, #7, #9, #10, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0219 A[Catch: all -> 0x0b7b, TryCatch #17 {all -> 0x0b7b, blocks: (B:8:0x0033, B:10:0x003f, B:11:0x0aee, B:14:0x0b3f, B:17:0x0b45, B:24:0x0b4d, B:27:0x0b57, B:29:0x0b5b, B:30:0x0b62, B:31:0x0b06, B:35:0x0b17, B:38:0x0b21, B:40:0x0b25, B:41:0x0b2c, B:42:0x0b0f, B:44:0x004c, B:46:0x005e, B:47:0x0064, B:49:0x006b, B:50:0x0071, B:53:0x00b9, B:67:0x00fd, B:68:0x0116, B:70:0x011e, B:71:0x0134, B:73:0x013c, B:74:0x0167, B:76:0x016f, B:79:0x0179, B:88:0x01b2, B:89:0x01cb, B:97:0x01f3, B:98:0x01f9, B:99:0x0219, B:104:0x022f, B:112:0x0257, B:113:0x025d, B:115:0x026d, B:116:0x028f, B:117:0x0284, B:118:0x029c, B:123:0x02b2, B:134:0x02ed, B:135:0x02f3, B:137:0x02fb, B:139:0x0303, B:141:0x034c, B:143:0x0322, B:144:0x0341, B:145:0x0359, B:147:0x0369, B:149:0x0371, B:150:0x05d0, B:152:0x037f, B:153:0x038c, B:155:0x0394, B:157:0x039c, B:159:0x03aa, B:160:0x03b7, B:162:0x03bf, B:164:0x03ea, B:165:0x03f2, B:167:0x0425, B:168:0x0432, B:227:0x043a, B:170:0x0455, B:172:0x045d, B:175:0x0467, B:187:0x04b9, B:189:0x04c6, B:191:0x04e6, B:193:0x04f3, B:195:0x0513, B:197:0x0520, B:199:0x0540, B:201:0x054d, B:203:0x056c, B:204:0x0578, B:205:0x058f, B:223:0x05a6, B:225:0x05c5, B:229:0x0448, B:230:0x05dd, B:238:0x05f3, B:246:0x061b, B:247:0x0621, B:249:0x0631, B:250:0x0653, B:251:0x0648, B:252:0x0660, B:267:0x0676, B:269:0x067e, B:270:0x0684, B:279:0x06bd, B:280:0x06d6, B:288:0x06fe, B:289:0x0704, B:290:0x0724, B:295:0x0740, B:303:0x0768, B:304:0x076e, B:306:0x077e, B:307:0x0799, B:308:0x078e, B:309:0x07a6, B:314:0x07c2, B:323:0x0801, B:324:0x09b5, B:325:0x080e, B:327:0x081e, B:328:0x0831, B:329:0x085a, B:331:0x0862, B:332:0x0868, B:333:0x0883, B:335:0x0893, B:336:0x08a4, B:338:0x08ac, B:341:0x08b6, B:343:0x08be, B:344:0x08cf, B:346:0x08d7, B:347:0x08e8, B:349:0x08f0, B:350:0x0910, B:359:0x0949, B:360:0x0955, B:361:0x0965, B:362:0x0975, B:363:0x0985, B:374:0x0995, B:375:0x09a5, B:386:0x09c2, B:399:0x0a12, B:400:0x0a18, B:402:0x0a28, B:403:0x0a43, B:404:0x0a38, B:405:0x0a50, B:407:0x0a58, B:408:0x0a68, B:410:0x0a70, B:411:0x0a7f, B:412:0x0a84, B:414:0x0a8c, B:415:0x0aa7, B:416:0x0aac, B:418:0x0ab4, B:419:0x0acf, B:420:0x0ad4, B:451:0x0089, B:452:0x008b, B:460:0x00a0, B:464:0x0b7a, B:454:0x008c, B:456:0x0090, B:457:0x0093, B:458:0x009d), top: B:7:0x0033, inners: #1, #2, #3, #4, #6, #7, #9, #10, #13, #14, #15 }] */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle call(java.lang.String r18, java.lang.String r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 3070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbhi.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException(String.format("delete not supported: %s", uri));
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new UnsupportedOperationException(String.format("getType not supported: %s", uri));
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException(String.format("insert not supported: %s", uri));
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException(String.format("query not supported: %s", uri));
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException(String.format("update not supported: %s", uri));
    }
}
