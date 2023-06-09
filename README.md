간단한 요구사항이 주어졌을 때 얼마나 상세한 부분까지 신경써서 구현하는지 확인하는 과제입니다.

지그재그 서비스에 있는 [쇼핑몰 목록](sample_list.png)과 [쇼핑몰 필터](sample_filter.png) 화면을 만들면 됩니다.

# 요구사항
* 다음의 기능을 가져야 합니다.
    1. 쇼핑몰 목록에서 쇼핑몰 이름과 순위 표시
    2. 쇼핑몰 필터 화면
    3. 쇼핑몰 필터 선택 완료시 목록에서 해당 필터에 대응하는 쇼핑몰만 표시
    4. 목록에서 쇼핑몰 사진 표시
    5. 목록에서 쇼핑몰 스타일 표시
    6. 목록에서 쇼핑몰 나이대 표시
* 필터 방식
    * 아무것도 선택하지 않은 타입(나이대/스타일)은 필터 조건에서 제외합니다. 두가지 모두 아무것도 선택하지 않은 경우 모든 쇼핑몰을 표시합니다.
    * 나이대와 스타일 두 타입을 모두 선택한 경우 두 조건을 모두 만족하는 쇼핑몰만 표시합니다.
    * 각 타입에서 여러 값을 선택한 경우 하나만 만족해도 표시합니다.
    * 스타일을 두개 이상 선택한 경우, 두 스타일을 모두 만족하는 쇼핑몰을 하나만 만족하는 쇼핑몰보다 위에 표시합니다. 같은 개수안에서는 쇼핑몰 점수 순으로 정렬합니다.
* 예제 이미지의 디자인을 완벽히 구현하지 않아도 됩니다.
* 쇼핑몰 목록 데이터는 shop\_list.json 파일에 담겨 있습니다.
    * 'n'은 쇼핑몰 이름입니다.
    * 'u'는 쇼핑몰 주소입니다.
    * 'S'는 쇼핑몰 스타일입니다. 최대 2개의 스타일이 ,로 묶여있습니다.
    * 'A'는 쇼핑몰 나이대입니다. 배열 차례대로 '10대', '20대초반', '20대중반', '20대후반', '30대초반', '30대중반', '30대후반' 여부를 나타냅니다. 1은 나이대에 해당함, 0은 해당하지 않음을 나타냅니다.
    * '0'은 쇼핑몰 점수입니다. 점수가 높을 수록 쇼핑몰 순위가 높습니다.
* 쇼핑몰 사진은 다음과 같은 주소에 존재합니다. 쇼핑몰 주소에서 유추할 수 있습니다.
    * https://cf.shop.s.zigzag.kr/images/imvely.jpg
    * https://cf.shop.s.zigzag.kr/images/66girls.jpg
    * 사진이 없는 쇼핑몰은 무시하셔도 됩니다.
* 나이대 표시시 20대초반, 20대중반, 20대후반중 어느 하나만 해당하면 20대로 표시하고 있습니다.
* Xcode, Android Studio에서 표시되는 컴파일 경고는 가급적 모두 해결해주세요.
* 제출시 build 디렉토리, apk 파일등 최종 결과물은 포함하지 않아도 됩니다.

# 평가기준
* 기능 완성도
* 코드 구성 / 코드 가독성 (불필요한 주석은 없는 것을 선호합니다)
